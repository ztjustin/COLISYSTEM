package com.colisystem.service;

import java.util.List;

import com.colisystem.entity.User;

public interface UserService{
	
	public abstract List<User> getAll();
	
	public abstract User getOne(String userName);
	
	public abstract User addOne(User user);
	
	public abstract void delete(String userName);
	
}
