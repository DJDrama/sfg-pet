package dj.springframework.sfgpetclinic.services;

import dj.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
