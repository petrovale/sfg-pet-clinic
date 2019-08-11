package ru.org.spring.sfgpetclinic.services;

import java.util.Set;
import ru.org.spring.sfgpetclinic.model.Owner;

public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner);

  Set<Owner> findAll();
}
