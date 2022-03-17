package com.app.mappers;

import com.app.entites.Cliente;
import com.app.request.ClientRequest;
import org.springframework.stereotype.Component;

@Component
public class ClientRequestToModel {
  public Cliente toModel(ClientRequest request) {
    return new Cliente(request.getName(), request.getAge());
  }
}
