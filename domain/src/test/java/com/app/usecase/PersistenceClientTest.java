package com.app.usecase;

import com.app.entites.Cliente;
import com.app.exception.ValidationException;
import com.app.port.ClientPort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.openMocks;

class PersistenceClientTest {
  @Mock
  private ClientPort clientPort;

  final PersistenceClient makeSut() {
    return new PersistenceClient(clientPort);
  }

  @BeforeEach
  void setUp() {
    openMocks(this);
  }

  @Test
  @DisplayName("Verify implementation this interface")
  void testUm() {
    final var sut = makeSut();
    final var client = new Cliente("name", 20);
    sut.save(client);

    verify(clientPort, times(1)).save(client);
  }


}