package ru.org.spring.sfgpetclinic.services;

import ru.org.spring.sfgpetclinic.model.Pet;

public interface PetService extends CrudService<Pet, Long> {

  Pet findByLastName(String lastName);
}
