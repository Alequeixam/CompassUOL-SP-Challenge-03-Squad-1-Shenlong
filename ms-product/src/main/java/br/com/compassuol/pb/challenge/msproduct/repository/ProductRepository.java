package br.com.compassuol.pb.challenge.msproduct.repository;

import br.com.compassuol.pb.challenge.msproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
