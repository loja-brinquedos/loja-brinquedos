package com.fatec.loja_brinquedos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.loja_brinquedos.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
