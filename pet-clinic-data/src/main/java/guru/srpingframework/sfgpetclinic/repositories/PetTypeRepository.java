package guru.srpingframework.sfgpetclinic.repositories;

import guru.srpingframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
