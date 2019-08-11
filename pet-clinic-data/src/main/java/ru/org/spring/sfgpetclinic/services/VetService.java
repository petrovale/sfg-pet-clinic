package ru.org.spring.sfgpetclinic.services;

import java.util.Set;
import ru.org.spring.sfgpetclinic.model.Vet;

public interface VetService {

  Vet findByLastName(String lastName);

  Vet findById(Long id);

  Vet save(Vet vet);

  Set<Vet> findAll();

}
