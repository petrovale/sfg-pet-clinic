package ru.org.spring.sfgpetclinic.services.map;

import java.util.Set;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import ru.org.spring.sfgpetclinic.model.Speciality;
import ru.org.spring.sfgpetclinic.model.Vet;
import ru.org.spring.sfgpetclinic.services.SpecialtyService;
import ru.org.spring.sfgpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialtyService specialtyService;

  public VetServiceMap(SpecialtyService specialtyService) {
    this.specialtyService = specialtyService;
  }

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
    if (object.getSpecialities().size() > 0){
      object.getSpecialities().forEach(speciality -> {
        if(speciality.getId() == null){
          Speciality savedSpecialty = specialtyService.save(speciality);
          speciality.setId(savedSpecialty.getId());
        }
      });
    }
    return super.save(object);
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
