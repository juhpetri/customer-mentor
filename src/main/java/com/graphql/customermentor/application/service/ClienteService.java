package com.graphql.customermentor.application.service;

import com.graphql.customermentor.domain.entity.Cliente;
import com.graphql.customermentor.domain.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public Cliente criarCliente(Cliente cliente) {
        System.out.println("Cliente: " + cliente);
        log.info("Criando cliente {}", cliente);
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(String id, Cliente cliente) {
        System.out.println("Cliente: " + cliente);
        log.info("Atualizando cliente {}", cliente);
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(String id) {
        log.info("Buscando cliente por id {}", id);
        return clienteRepository.findById(id).orElseThrow();
    }

    public Cliente buscarPorEmail(String email) {
        log.info("Buscando cliente por email {}", email);
        return clienteRepository.findByEmail(email).orElseThrow();
    }

    public Cliente buscarPorDocumento(String documento) {
        log.info("Buscando cliente por documento {}", documento);
        return clienteRepository.findByDocumento(documento).orElseThrow();
    }

    public List<Cliente> listarPorNome(String nome) {
        log.info("Buscando clientes por nome {}", nome);
        return clienteRepository.findByNomeContaining(nome);
    }

    public List<Cliente> listarTodos() {
        log.info("Buscando todos os clientes");
        return clienteRepository.findAll();
    }

    public void deletarCliente(String id) {
        log.info("Deletando cliente {}", id);
        clienteRepository.deleteById(id);
    }
}
