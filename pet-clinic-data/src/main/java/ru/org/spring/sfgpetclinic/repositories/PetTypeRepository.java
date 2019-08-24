package ru.org.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.org.spring.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
