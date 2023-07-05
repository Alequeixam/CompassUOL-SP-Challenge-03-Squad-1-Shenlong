package br.com.compassuol.pb.challenge.msproduct.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 2, message = "Name must be at least 2 characters long")
    private String name;

    @ManyToMany(mappedBy = "productCategory")
    Set<Product> products;
}
