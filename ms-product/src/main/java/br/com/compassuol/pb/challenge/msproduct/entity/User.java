package br.com.compassuol.pb.challenge.msproduct.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    @NotBlank
    @Size(min = 2, message = "First and last name should be at least 2 characters long")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    @NotBlank
    @Size(min = 2, message = "First and last name should be at least 2 characters long")
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    @Email
    private String email;

    @Column(name = "password", nullable = false)
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    /*ROLES*/
    @ManyToMany
    Set<Role> roles = new HashSet<>();
}
