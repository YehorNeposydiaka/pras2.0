package com.shop.pras.Models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bases")
public class Base {

    @Id
    @Column(length = 50)
    private String baseLogin;

    @Column(nullable = false)
    private String baseName;

    @Column(nullable = false)
    private String basePassword;

    // Связь с категориями
    @OneToMany(mappedBy = "base", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Category> categories = new ArrayList<>();

    // Связь с продуктами
    @OneToMany(mappedBy = "base", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> products = new ArrayList<>();

    public Base() {}

    public Base(String login, String name, String password) {
        this.baseLogin = login;
        this.baseName = name;
        this.basePassword = password;
    }

    // Геттеры и сеттеры
    public String getBaseLogin() { return baseLogin; }
    public void setBaseLogin(String baseLogin) { this.baseLogin = baseLogin; }

    public String getBaseName() { return baseName; }
    public void setBaseName(String baseName) { this.baseName = baseName; }

    public String getBasePassword() { return basePassword; }
    public void setBasePassword(String basePassword) { this.basePassword = basePassword; }

    public List<Category> getCategories() { return categories; }
    public void setCategories(List<Category> categories) { this.categories = categories; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }
}
