package com.shop.pras.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String productName;

    private double cost;

    private double price;

    private double quantity;

    // Связь с категорией
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    // Связь с базой
    @ManyToOne
    @JoinColumn(name = "base_id", nullable = false)
    private Base base;

    public Product() {}

    public Product(String code, String name, double cost, double price, double quantity, Category category, Base base){
        this.code = code;
        this.productName = name;
        this.cost = cost;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.base = base;
    }

    // Геттеры и сеттеры
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public double getCost() { return cost; }
    public void setCost(double cost) { this.cost = cost; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getQuantity() { return quantity; }
    public void setQuantity(double quantity) { this.quantity = quantity; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public Base getBase() { return base; }
    public void setBase(Base base) { this.base = base; }

    @Override
    public String toString() {
        return "код " + code + ", название " + productName + ", себистоимость " + cost + ", цена " + price + ", кол-во " + quantity;
    }
}
