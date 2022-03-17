package com.app.controllers;

import com.app.entites.Cliente;
import com.app.mappers.ClientRequestToModel;
import com.app.request.ClientRequest;
import com.app.usecase.PersistenceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/client")
@RequiredArgsConstructor
public class ClientController {
  private final PersistenceClient persistenceClient;

  private final ClientRequestToModel clientRequestToModel;

  @PostMapping
  public ResponseEntity<Cliente> saveClient(@RequestBody ClientRequest request) {
    final var cliente = clientRequestToModel.toModel(request);
    persistenceClient.save(cliente);
    return new ResponseEntity<>(cliente, HttpStatus.OK);
  }
}
