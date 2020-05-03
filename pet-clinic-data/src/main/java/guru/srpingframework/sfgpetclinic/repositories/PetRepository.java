package guru.srpingframework.sfgpetclinic.repositories;

import guru.srpingframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
