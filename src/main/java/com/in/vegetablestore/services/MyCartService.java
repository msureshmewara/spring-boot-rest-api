package com.in.vegetablestore.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.in.vegetablestore.model.Cart;
import com.in.vegetablestore.model.ProductDetails;
import com.in.vegetablestore.model.UserCartDetails;
import com.in.vegetablestore.querymapper.MyCartQueryMapper;
import com.in.vegetablestore.querymapper.ProductQueryMapper;

@Service
public class MyCartService {

	public ArrayList<UserCartDetails> getMyCartDetails(String user_id, JdbcTemplate jdbc) {
		String cartDetailsSql = "SELECT * from cart_details where user_id = ?";
		String cartProductDetailsSql = "SELECT * FROM product_details WHERE id = ?";
		List<Cart> cart_details = jdbc.query(cartDetailsSql, new Object[] { user_id }, new MyCartQueryMapper());
		//ArrayList<ProductDetails> cart_product_details = new ArrayList<ProductDetails>() ;
		ArrayList<UserCartDetails> user_cart_detail = new ArrayList<UserCartDetails>();
		for (int i = 0; i < cart_details.size(); i++) {
			System.out.println("PRODUCT_ID "+ cart_details.get(i).getProduct_id());
			ProductDetails product_details = jdbc.queryForObject(cartProductDetailsSql, new Object[] { cart_details.get(i).getProduct_id() }, new ProductQueryMapper());
			//cart_product_details.add(product_details);
			UserCartDetails cart = new UserCartDetails(product_details.getId(), 
					product_details.getCategory_id(),
					cart_details.get(i).getProduct_quantity(), 
					product_details.getName(),
					product_details.getPrice(),
					product_details.getAvailablity(),
					product_details.getDiscount(),
					product_details.getThumb_url(),
					product_details.getRating());
			user_cart_detail.add(cart);
		}
		
 		return user_cart_detail;
	}
}
