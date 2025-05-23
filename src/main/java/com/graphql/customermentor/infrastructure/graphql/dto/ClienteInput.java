package com.graphql.customermentor.infrastructure.graphql.dto;

public record ClienteInput(
        String nome,
        String email,
        String documento,
        String telefone,
        String dataNascimento
) {}

