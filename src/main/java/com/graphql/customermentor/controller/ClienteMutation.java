package com.graphql.customermentor.controller;

import com.graphql.customermentor.application.service.ClienteService;
import com.graphql.customermentor.domain.entity.Cliente;
import com.graphql.customermentor.infrastructure.graphql.dto.ClienteInput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@Controller
@RequiredArgsConstructor
public class ClienteMutation {
    private final ClienteService clienteService;

    @MutationMapping
    public Cliente criarCliente(@Argument ClienteInput input) {
        System.out.println("ClienteInput: " + input);
        log.info("Criando cliente {}", input);
        Cliente cliente = new Cliente(UUID.randomUUID().toString(),
                input.nome(),
                input.email(),
                input.documento(),
                input.telefone(),
                input.dataNascimento());
        return clienteService.criarCliente(cliente);
    }

    @MutationMapping
    public Cliente atualizarCliente(@Argument String id, @Argument ClienteInput input) {
        System.out.println("ClienteInput: " + input);
        log.info("Atualizando cliente {}", input);
        Cliente cliente = new Cliente(id,
                input.nome(),
                input.email(),
                input.documento(),
                input.telefone(),
                input.dataNascimento());
        return clienteService.atualizarCliente(id, cliente);
    }

    @MutationMapping
    public boolean deletarCliente(@Argument String id) {
        log.info("Deletando cliente {}", id);
        clienteService.deletarCliente(id);
        return true;
    }
}
