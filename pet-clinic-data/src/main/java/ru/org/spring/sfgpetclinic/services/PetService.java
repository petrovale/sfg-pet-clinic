package ru.org.spring.sfgpetclinic.services;

import java.util.Set;
import ru.org.spring.sfgpetclinic.model.Pet;

public interface PetService {

  Pet findByLastName(String lastName);

  Pet findById(Long id);

  Pet save(Pet pet);

  Set<Pet> findAll();
}
