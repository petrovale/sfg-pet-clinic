package ru.org.spring.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

  @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
  public String listVets(Model model) {

    return "vets/index";
  }
}
