package com.app;

import com.app.entites.Cliente;
import com.app.model.ClientModel;
import com.app.port.ClientPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ClientImpl implements ClientPort {

  private final ClientJpa clientJpa;

  @Override
  public void save(Cliente cliente) {
    final var clientModel = clientToModel(cliente);
    clientJpa.save(clientModel);
  }

  private ClientModel clientToModel(Cliente cliente) {
    final var clientDomain = new Cliente(cliente.getName(), cliente.getAge());
    final var clientModel = new ClientModel();
    clientModel.setName(clientDomain.getName());
    clientModel.setAge(clientDomain.getAge());
    return clientModel;
  }
}
