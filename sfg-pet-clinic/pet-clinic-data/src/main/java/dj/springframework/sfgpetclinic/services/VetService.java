package dj.springframework.sfgpetclinic.services;

import dj.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {


    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
