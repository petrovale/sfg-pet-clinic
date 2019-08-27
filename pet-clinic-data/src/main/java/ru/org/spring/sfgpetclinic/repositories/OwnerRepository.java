package ru.org.spring.sfgpetclinic.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import ru.org.spring.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findByLastName(String lastName);

  List<Owner> findAllByLastNameLike(String lastName);
}
