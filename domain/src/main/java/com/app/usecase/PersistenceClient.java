package com.app.usecase;

import com.app.port.ClientPort;
import com.app.entites.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersistenceClient {
  private final ClientPort clientPort;

  public void save(Cliente cliente) {
    clientPort.save(cliente);
  }
}
