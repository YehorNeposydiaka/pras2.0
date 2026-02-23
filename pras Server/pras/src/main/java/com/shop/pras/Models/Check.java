package com.shop.pras.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "checks")
public class Check {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Геттеры и сеттеры
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
}
