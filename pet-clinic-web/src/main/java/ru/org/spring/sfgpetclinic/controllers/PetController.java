package ru.org.spring.sfgpetclinic.controllers;

import java.util.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.org.spring.sfgpetclinic.model.Owner;
import ru.org.spring.sfgpetclinic.model.PetType;
import ru.org.spring.sfgpetclinic.services.OwnerService;
import ru.org.spring.sfgpetclinic.services.PetService;
import ru.org.spring.sfgpetclinic.services.PetTypeService;

@Controller
@RequestMapping("/owners/{ownerId}")
public class PetController {

  private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";

  private final PetService petService;
  private final OwnerService ownerService;
  private final PetTypeService petTypeService;

  public PetController(PetService petService, OwnerService ownerService, PetTypeService petTypeService) {
    this.petService = petService;
    this.ownerService = ownerService;
    this.petTypeService = petTypeService;
  }

  @ModelAttribute("types")
  public Collection<PetType> populatePetTypes() {
    return petTypeService.findAll();
  }

  @ModelAttribute("owner")
  public Owner findOwner(@PathVariable("ownerId") Long ownerId) {
    return ownerService.findById(ownerId);
  }

  @InitBinder("owner")
  public void initOwnerBinder(WebDataBinder dataBinder) {
    dataBinder.setDisallowedFields("id");
  }
}