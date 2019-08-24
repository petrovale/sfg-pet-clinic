package ru.org.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.org.spring.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
