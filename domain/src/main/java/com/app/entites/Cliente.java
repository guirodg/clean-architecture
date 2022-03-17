package com.app.entites;

import com.app.exception.ValidationException;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
import java.util.regex.Pattern;

@Getter
@Setter
public class Cliente {
  private final String name;
  private final int age;

  public Cliente(final String name, final int age) {
    this.name = isNameValid(name);
    this.age = isAgeValid(age);
  }

  private int isAgeValid(int age) {
    final var regex = "\\b([1-9]|[1-9][0-9]|100)\\b";
    final var ageString = String.valueOf(age);
    boolean matches = Pattern.matches(regex, ageString);
    if (!matches) throw new ValidationException("age is not in default");
    return age;
  }

  private String isNameValid(String name) {
    boolean nameIsNull = Objects.isNull(name);
    if (nameIsNull) throw new ValidationException("client is name null");
    final var regex = "^[a-z A-Z]{0,50}$";
    boolean matches = Pattern.matches(regex, name);
    if (!matches) throw new ValidationException("name is not in default");
    return name;
  }
}
