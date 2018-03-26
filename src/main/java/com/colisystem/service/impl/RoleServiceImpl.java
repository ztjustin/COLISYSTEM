package com.colisystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.colisystem.entity.Role;
import com.colisystem.repository.RoleJpaRepository;
import com.colisystem.service.RoleService;

@Service("roleServiceImpl")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	@Qualifier("roleJpaRepository")
	private RoleJpaRepository roleJpaRepository;

	@Override
	public List<Role> getAll() {
		return roleJpaRepository.findAll();
	}

	@Override
	public Role getOne(int roleId) {
		return roleJpaRepository.getOne(roleId);
	}

	@Override
	public Role addOne(Role role) {
		return roleJpaRepository.saveAndFlush(role);
	}

	@Override
	public Role getByNameRole(String role) {
		return roleJpaRepository.findByName(role);
	}

	@Override
	public void delete(int roleId) {
		// TODO Auto-generated method stub
		roleJpaRepository.deleteById(roleId);
	}

}
