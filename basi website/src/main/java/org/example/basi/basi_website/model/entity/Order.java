package org.example.basi.basi_website.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    public Order(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



}
