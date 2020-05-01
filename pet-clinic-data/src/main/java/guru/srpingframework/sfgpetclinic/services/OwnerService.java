package guru.srpingframework.sfgpetclinic.services;

import guru.srpingframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

}
