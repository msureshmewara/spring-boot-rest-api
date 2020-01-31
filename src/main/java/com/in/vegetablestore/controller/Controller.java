package com.in.vegetablestore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.in.vegetablestore.model.NewOrder;
import com.in.vegetablestore.model.OrderStatus;
import com.in.vegetablestore.model.ProductCategory;
import com.in.vegetablestore.model.ProductDetails;
import com.in.vegetablestore.model.UserCartDetails;
import com.in.vegetablestore.model.UserDetails;
import com.in.vegetablestore.services.LoginService;
import com.in.vegetablestore.services.MyCartService;
import com.in.vegetablestore.services.NewOrderService;
import com.in.vegetablestore.services.ProductCategoryService;
import com.in.vegetablestore.services.ProductService;
import com.in.vegetablestore.services.SignUpService;

@RestController
@CrossOrigin("http://localhost:4200")
//@CrossOrigin(origins="http://192.168.0.109:4200")
public class Controller {

	@Autowired
	JdbcTemplate jdbc;

	@Autowired
	LoginService loginService;

	@Autowired
	SignUpService signUpService;

	@Autowired
	NewOrderService newOrderService;

	@Autowired
	MyCartService myCartService;

	@Autowired
	ProductCategoryService productCategoryService;
	
	@Autowired
	ProductService productService;

	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to rest API";

	}

	@PostMapping(path = "/signUp", consumes = "application/json", produces = "application/json")
	public UserDetails signUp(@RequestBody UserDetails userdetails) {
		return signUpService.signUp(userdetails, jdbc);
	}

	@GetMapping("/login")
	public UserDetails login(@RequestParam String username, @RequestParam String password) {
		return loginService.login(username, password, jdbc);
	}

	@GetMapping("/productcategory")
	public List<ProductCategory> getProductCategory() {
		return productCategoryService.getProductCategory(jdbc);
	}
	
	@GetMapping("/product")
	public List<ProductDetails> getProductByCategory(@RequestParam String cat_id) {
		return productService.getProductByCategory(cat_id, jdbc);
	}
	@PostMapping(path = "/neworder", consumes = "application/json", produces = "application/json")
	public OrderStatus placeNewOrder(@RequestBody NewOrder orderDetails) {
		System.out.println(orderDetails);
		return newOrderService.placeNewOrder(orderDetails, jdbc);
	}

	@GetMapping("/cartdetails")
	public ArrayList<UserCartDetails> getUserCartDetails(@RequestParam String user_id) {
		return myCartService.getMyCartDetails(user_id, jdbc);
	}
}
 