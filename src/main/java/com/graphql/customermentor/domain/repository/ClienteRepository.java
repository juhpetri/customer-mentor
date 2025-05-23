package com.graphql.customermentor.domain.repository;

import com.graphql.customermentor.domain.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
    Optional<Cliente> findByEmail(String email);
    Optional<Cliente> findByDocumento(String documento);
    List<Cliente> findByNomeContaining(String nome);
}
