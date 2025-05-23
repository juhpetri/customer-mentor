package com.graphql.customermentor.infrastructure.graphql.exception;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.graphql.execution.DataFetcherExceptionResolverAdapter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GraphQLExceptionHandler extends DataFetcherExceptionResolverAdapter {

    @Override
    protected List<GraphQLError> resolveToMultipleErrors(Throwable ex, DataFetchingEnvironment env) {
        ex.printStackTrace(); // garante que qualquer exceção apareça no console
        return List.of(
                GraphqlErrorBuilder.newError()
                        .message("Erro interno: " + ex.getMessage())
                        .build()
        );
    }
}

