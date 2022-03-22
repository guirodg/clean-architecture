package com.app;

import com.app.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientJpa extends JpaRepository<Client, Long> {
}
