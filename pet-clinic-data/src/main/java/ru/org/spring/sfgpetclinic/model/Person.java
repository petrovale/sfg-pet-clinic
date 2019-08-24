package ru.org.spring.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class Person extends BaseEntity {

  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
}
