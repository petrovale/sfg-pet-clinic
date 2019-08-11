package ru.org.spring.sfgpetclinic.services;

import ru.org.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);
}
