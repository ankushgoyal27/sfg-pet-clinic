package com.springpractice.sfgpetclinic.services;

import com.springpractice.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> finndAll();
}