package ru.org.spring.sfgpetclinic.services;

import ru.org.spring.sfgpetclinic.model.Vet;

public interface VetService extends CrudService<Vet, Long> {

  Vet findByLastName(String lastName);
}
