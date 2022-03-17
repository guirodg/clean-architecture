package com.app;

import com.app.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientJpa extends JpaRepository<ClientModel, Long> {
}
