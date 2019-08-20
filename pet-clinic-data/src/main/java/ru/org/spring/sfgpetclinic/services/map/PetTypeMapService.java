package ru.org.spring.sfgpetclinic.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import ru.org.spring.sfgpetclinic.model.PetType;
import ru.org.spring.sfgpetclinic.services.PetTypeService;

@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {

  @Override
  public Set<PetType> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(PetType object) {
    super.delete(object);
  }

  @Override
  public PetType save(PetType object) {
    return super.save(object);
  }

  @Override
  public PetType findById(Long id) {
    return super.findById(id);
  }
}