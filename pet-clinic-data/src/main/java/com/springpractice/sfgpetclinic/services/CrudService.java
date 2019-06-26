package com.springpractice.sfgpetclinic.services;

import java.util.Set;

//Common Repo

public interface CrudService<T, ID> {

	Set<T> findAll();
	
	T findById(ID id);
	
	T save(T object); 
	
	void delete(T object);
	
	void deleteById(ID id);
}