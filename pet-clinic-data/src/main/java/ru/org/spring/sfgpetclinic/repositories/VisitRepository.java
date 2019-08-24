package ru.org.spring.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.org.spring.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
