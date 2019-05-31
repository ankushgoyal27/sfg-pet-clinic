package com.springpractice.sfgpetclinic.services;

import com.springpractice.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> finndAll();
}
