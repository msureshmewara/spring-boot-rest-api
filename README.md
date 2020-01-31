# Spring Boot REST API Beginners Tutorials.

#Database
	MySQL

# Online Shopping Examples.
1. Login Module.
2. Sign Up Module.
3. Product Category.
4. Product Details.
5. My Cart.

# Database Table Structure.
# 1. UserTable.
CREATE TABLE `mydatabase`.`user_login` (
  `id` VARCHAR(50) NOT NULL ,
  `user_name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `email_id` VARCHAR(45) NOT NULL,
`phone_number` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
 
# 2. Cart Details
CREATE TABLE `mydatabase`.`cart_details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` VARCHAR(45) NOT NULL,
  `product_id` VARCHAR(45) NOT NULL,
  `product_category` VARCHAR(45) NOT NULL,
  `product_quantity` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  
# 3. Product Details
CREATE TABLE `mydatabase`.`product_details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `price` VARCHAR(45) NOT NULL,
  `availablity` VARCHAR(45) NOT NULL,
  `category_id` VARCHAR(45) NOT NULL,
  `details` VARCHAR(545) NULL,
  `discount` VARCHAR(45) NULL,
  `thumb_url` VARCHAR(545) NULL,
  `about` VARCHAR(45) NULL,
  `benefits` VARCHAR(445) NULL,
  `rating` VARCHAR(45) NULL,
  `quantity` VARCHAR(145) NULL,
  PRIMARY KEY (`id`));
  
# 4. Product Category
CREATE TABLE `mydatabase`.`product_category` (
  `cat_id` INT NOT NULL AUTO_INCREMENT,
  `cat_name` VARCHAR(45) NOT NULL,
  `cat_offer` VARCHAR(45) NOT NULL,
  `cat_thum_url` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id`));
 
# 5. User orders
CREATE TABLE `mydatabase`.`user_orders` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NOT NULL,
  `amount` VARCHAR(45) NOT NULL,
  `user_id` VARCHAR(45) NOT NULL,
  `status` VARCHAR(45) NOT NULL,
  `delivery_date` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
  
# 6. Order Product Details
CREATE TABLE `mydatabase`.`order_product_details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `order_id` VARCHAR(45) NOT NULL,
`user_id` VARCHAR(45) NOT NULL,
`pro_price` VARCHAR(45) NOT NULL,
`pro_cat_id` VARCHAR(45) NOT NULL,
`pro_discount` VARCHAR(45) NOT NULL,
`pro_thumb_url` VARCHAR(45) NOT NULL,
`pro_rating` VARCHAR(45) NOT NULL,
`pro_quantity` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
