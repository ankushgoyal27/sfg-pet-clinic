package com.springpractice.sfgpetclinic.services;

import com.springpractice.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
