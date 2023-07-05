package br.com.compassuol.pb.challenge.msproduct.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
    @Column(name = "date", nullable = false)
    @NotEmpty
    private LocalDateTime date;

    @Column(name = "name", nullable = false)
    @NotBlank
    @NotEmpty
    private String name;

    @Column(name = "description", nullable = false)
    @NotBlank
    @NotEmpty
    private String description;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name = "price", nullable = false)
    @NotBlank
    @NotEmpty
    private Double price;

    // category
}
