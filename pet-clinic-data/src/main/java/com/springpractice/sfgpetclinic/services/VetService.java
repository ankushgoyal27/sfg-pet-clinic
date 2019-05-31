package com.springpractice.sfgpetclinic.services;

import com.springpractice.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> finndAll();
}
