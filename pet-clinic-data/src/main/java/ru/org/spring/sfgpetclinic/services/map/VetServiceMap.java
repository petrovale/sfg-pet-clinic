package ru.org.spring.sfgpetclinic.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import ru.org.spring.sfgpetclinic.model.Vet;
import ru.org.spring.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet object) {
    super.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  @Override
  public Vet save(Vet object) {
    return super.save(object.getId(), object);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Vet findByLastName(String lastName) {
    return null;
  }
}
