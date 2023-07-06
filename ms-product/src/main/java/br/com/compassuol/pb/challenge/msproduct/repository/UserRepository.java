package br.com.compassuol.pb.challenge.msproduct.repository;

import br.com.compassuol.pb.challenge.msproduct.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
