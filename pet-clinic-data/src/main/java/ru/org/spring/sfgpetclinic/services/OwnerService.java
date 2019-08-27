package ru.org.spring.sfgpetclinic.services;

import java.util.List;
import ru.org.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String lastName);
}
