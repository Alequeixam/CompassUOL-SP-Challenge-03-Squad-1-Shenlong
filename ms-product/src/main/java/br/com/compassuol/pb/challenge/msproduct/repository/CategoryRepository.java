package br.com.compassuol.pb.challenge.msproduct.repository;

import br.com.compassuol.pb.challenge.msproduct.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
