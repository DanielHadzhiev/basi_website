package org.example.basi.basi_website.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToMany(mappedBy = "cartItems")
    private List<Order> order;

}
