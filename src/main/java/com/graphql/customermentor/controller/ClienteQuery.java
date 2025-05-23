package com.graphql.customermentor.controller;

import com.graphql.customermentor.application.service.ClienteService;
import com.graphql.customermentor.domain.entity.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ClienteQuery {
    private final ClienteService service;

    @QueryMapping
    public Cliente clientePorId(@Argument String id) {
        log.info("Buscando cliente por id {}", id);
        return service.buscarPorId(id);
    }

    @QueryMapping
    public Cliente clientePorEmail(@Argument String email) {
        log.info("Buscando cliente por email{}", email);
        return service.buscarPorEmail(email);
    }

    @QueryMapping
    public Cliente clientePorDocumento(@Argument String documento) {
        log.info("Buscando cliente por documento {}", documento);
        return service.buscarPorDocumento(documento);
    }

    @QueryMapping
    public List<Cliente> clientesPorNome(@Argument String nome) {
        log.info("Buscando clientes por nome {}", nome);
        return service.listarPorNome(nome);
    }

    @QueryMapping
    public List<Cliente> clientes() {
        log.info("Buscando todos os clientes");
        return service.listarTodos();
    }
}
