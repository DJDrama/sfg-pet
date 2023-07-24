package dj.springframework.sfgpetclinic.services.springdatajpa;

import dj.springframework.sfgpetclinic.model.Pet;
import dj.springframework.sfgpetclinic.repository.PetRepository;
import dj.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service

@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
    final PetRepository petRepository;

    public PetSDJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> set = new HashSet<>();
        petRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
