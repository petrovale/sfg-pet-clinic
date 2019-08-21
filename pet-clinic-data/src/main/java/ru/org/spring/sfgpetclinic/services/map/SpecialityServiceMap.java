package ru.org.spring.sfgpetclinic.services.map;

import java.util.Set;
import org.springframework.stereotype.Service;
import ru.org.spring.sfgpetclinic.model.Speciality;
import ru.org.spring.sfgpetclinic.services.SpecialtyService;

@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements
    SpecialtyService {

  @Override
  public Set<Speciality> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Speciality object) {
    super.delete(object);
  }

  @Override
  public Speciality save(Speciality object) {
    return super.save(object);
  }

  @Override
  public Speciality findById(Long id) {
    return super.findById(id);
  }
}
