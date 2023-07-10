package br.com.compassuol.pb.challenge.msproduct.service;

import br.com.compassuol.pb.challenge.msproduct.entity.Category;
import br.com.compassuol.pb.challenge.msproduct.entity.Role;
import br.com.compassuol.pb.challenge.msproduct.exception.ResourceNotFoundException;
import br.com.compassuol.pb.challenge.msproduct.repository.RoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    private RoleRepository roleRepository;
    private ModelMapper mapper;

    public RoleService(RoleRepository roleRepository, ModelMapper mapper) {
        this.roleRepository = roleRepository;
        this.mapper = mapper;
    }

    public Role createRole(Role role) {

        List<Role> allRoles = roleRepository.findAll();
        for (Role r: allRoles) {
            if (r.getName().equals(role.getName())) {
                throw new RuntimeException("Role already registered");
            }
        }
        return roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long roleId) {
        return roleRepository.findById(roleId).orElseThrow(() ->
                new ResourceNotFoundException("Role", "id", roleId));
    }

}
