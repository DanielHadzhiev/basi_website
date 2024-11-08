package org.example.basi.basi_website.model.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "image_paths")
public class ImagePath {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public ImagePath(String url,Product product) {
        this.url = url;
        this.product = product;
    }
    public ImagePath() {

    }

    @Column(name = "urls")
    private String url;

    @ManyToOne(targetEntity = Product.class, fetch = FetchType.EAGER)
    private Product product;



}
