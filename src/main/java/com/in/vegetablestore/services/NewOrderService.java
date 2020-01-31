package com.in.vegetablestore.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.stereotype.Service;

import com.in.vegetablestore.model.NewOrder;
import com.in.vegetablestore.model.OrderProductDetails;
import com.in.vegetablestore.model.OrderStatus;
import com.in.vegetablestore.utils.Utils;

@Service
public class NewOrderService {

	public OrderStatus placeNewOrder(NewOrder newOrder, JdbcTemplate jdbc) {
		OrderStatus orderStatus;
		String orderNumber = Utils.getUniqueId();
		String sql = "INSERT INTO user_orders(id, date, amount, user_id, status, delivery_date) VALUES (?, ?, ?, ?, ?, ?)";

		int status = jdbc.update(sql, new Object[] { orderNumber, Utils.getCurrentDate(), newOrder.getAmount(),
				newOrder.getUser_id(), "1", Utils.getDeliveryDate() });
		if (status == 1) {
			int[][] updateCounts = jdbc.batchUpdate(
					"INSERT INTO order_product_details (order_id, user_id, pro_name, pro_price, pro_cat_id, pro_discount, pro_thumb_url, pro_rating, pro_quantity) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?);",
					newOrder.getOrder_pro_details(), newOrder.getOrder_pro_details().size(),
					new ParameterizedPreparedStatementSetter<OrderProductDetails>() {
						public void setValues(PreparedStatement ps, OrderProductDetails argument) throws SQLException {
							ps.setString(1, orderNumber);
							ps.setString(2, argument.getUser_id());
							ps.setString(3, argument.getPro_name());
							ps.setString(4, argument.getPro_price());
							ps.setString(5, argument.getPro_cat_id());
							ps.setString(6, argument.getPro_discount());
							ps.setString(7, argument.getPro_thumb_url());
							ps.setString(8, argument.getPro_rating());
							ps.setString(9, argument.getPro_quantity());
						}
					});
			if (updateCounts[0].length == newOrder.getOrder_pro_details().size()) {
				orderStatus = new OrderStatus(orderNumber, true, "Thankyou for order.", Utils.getCurrentDate(),
						Utils.getDeliveryDate());
			} else {
				orderStatus = new OrderStatus(null, false, "Something went wrong!!", null, null);
			}
		} else {
			orderStatus = new OrderStatus(null, false, "Something went wrong!!", null, null);
		}
		return orderStatus;
	}

}
