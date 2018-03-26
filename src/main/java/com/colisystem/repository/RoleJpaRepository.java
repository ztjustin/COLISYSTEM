package com.colisystem.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colisystem.entity.Role;

@Repository("roleJpaRepository")
public interface RoleJpaRepository  extends JpaRepository<Role, Serializable>{
	
	public Role findByName(String role);

}
