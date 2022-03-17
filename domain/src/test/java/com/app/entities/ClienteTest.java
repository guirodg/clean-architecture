package com.app.entities;


import com.app.entites.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {

  final Cliente makeSut() {
    return new Cliente("test", 99);
  }

  @Test
  void testeUm() {
    final var sut = makeSut();
    Assertions.assertDoesNotThrow(sut::getAge, sut.getName());
  }
}