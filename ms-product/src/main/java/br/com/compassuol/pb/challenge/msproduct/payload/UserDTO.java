package br.com.compassuol.pb.challenge.msproduct.payload;

import br.com.compassuol.pb.challenge.msproduct.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    Set<Role> role = new HashSet<>();
}
