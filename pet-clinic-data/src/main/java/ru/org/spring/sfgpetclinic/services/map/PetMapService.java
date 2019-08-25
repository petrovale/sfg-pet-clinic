package ru.org.spring.sfgpetclinic.services.map;

import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.org.spring.sfgpetclinic.model.Pet;
import ru.org.spring.sfgpetclinic.services.PetService;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Pet object) {
    super.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
  }

  @Override
  public Pet save(Pet object) {
    super.save(object);
    return object;
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }
}
