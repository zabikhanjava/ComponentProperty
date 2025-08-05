package com.example.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product { private int product_id;

  private double price;

  private String category;

  public int getProduct_id() {
    return product_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public Product(int product_id, double price, String category) {
    this.product_id = product_id;
    this.price = price;
    this.category = category;
  }

  void hello() {

    Product product = new Product(1, 100, "FootWear");
    Product product9 = new Product(2, 100, "FootWear");
    Product product1 = new Product(3, 300, "sometnhing");
    Product product2 = new Product(4, 700, "pop");
    Product product3 = new Product(5, 800, "hello");
    Product product4 = new Product(6, 900, "dd");
    List<Product> productList = new ArrayList<>();
    productList.add(product1);
    productList.add(product2);
    productList.add(product3);
    productList.add(product4);
    productList.add(product);
    productList.add(product9);
    productList.stream().filter(pro->pro.getCategory().equals("FootWear")).map(pro->{
      double price=pro.getPrice();
      price*=0.8;
      pro.setPrice(price);
      return pro;
    }).collect(Collectors.toList());
  }
}


//Find all the products which belong to “Footwear” category and apply 15% discount on them
