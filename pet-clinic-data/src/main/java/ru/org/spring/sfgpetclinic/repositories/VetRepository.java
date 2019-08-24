package ru.org.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.org.spring.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
