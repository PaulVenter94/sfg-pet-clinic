package guru.srpingframework.sfgpetclinic.services;

import guru.srpingframework.sfgpetclinic.model.Owner;
import guru.srpingframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
