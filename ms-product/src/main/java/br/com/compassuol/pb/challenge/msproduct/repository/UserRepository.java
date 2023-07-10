package br.com.compassuol.pb.challenge.msproduct.repository;

import br.com.compassuol.pb.challenge.msproduct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
