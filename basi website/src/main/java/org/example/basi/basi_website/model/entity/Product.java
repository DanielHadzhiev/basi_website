package org.example.basi.basi_website.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "products")
public class Product {
    public Product() {
    }

    public Product(String name,
                   String description,
                   double price,
                   String mainImageUrl,
                   String size) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.mainImageUrl = mainImageUrl;
        this.size = size;
        this.imageUrls = new ArrayList<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Setter
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Setter
    @Column(name = "description", nullable = false)
    private String description;

    @Setter
    @Column(name = "price", nullable = false)
    private double price;


    @Setter
    @Column(name = "main_image_url", nullable = false)
    private String mainImageUrl;

    @Setter
    @Column(name = "size", nullable = false)
    private String size;

    @Setter
    @OneToMany(fetch = FetchType.EAGER,
            targetEntity = ImagePath.class,
            mappedBy = "product")
    private List<ImagePath> imageUrls;


    public void setId(int id) {
        this.id = id;
    }

}
