package guru.srpingframework.sfgpetclinic.services;

import guru.srpingframework.sfgpetclinic.model.Owner;
import guru.srpingframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
