# CustomerMentor

**CustomerMentor** é um projeto educacional voltado para mentorias de desenvolvedores trainees, com foco no desenvolvimento de uma API GraphQL estruturada em **Clean Architecture** e persistência de dados utilizando **MongoDB**. A aplicação permite operações de cadastro, atualização e consulta de clientes, sendo um ponto de partida ideal para práticas com backend moderno em Java.

---

## 💡 Objetivo

O objetivo deste projeto é:

- Fornecer uma base sólida para mentorias técnicas em backend Java;
- Ensinar como estruturar uma API GraphQL com **Clean Architecture**;
- Demonstrar boas práticas de programação como **SOLID** e **Clean Code**;
- Oferecer um ambiente prático para interação com GraphQL e banco NoSQL (MongoDB).

---

## 🚀 Tecnologias Utilizadas

- Java 17+
- Spring Boot
- GraphQL Java Tools
- MongoDB
- Spring Data MongoDB
- MapStruct
- Maven
- JUnit & Mockito (para testes)

---

## 📦 Funcionalidades da API

A API permite:

- ✅ Cadastrar um novo cliente
- ♻️ Atualizar dados de cliente existente
- 🔍 Consultar clientes por ID ou e-mail
- 🔒 Validação de dados como e-mail e documento (CPF/CNPJ)
- 📁 Organização em camadas (clean architecture)
- 🧩 Definições de schema GraphQL para Cliente

---

## 🧱 Clean Architecture - Organização do Projeto

```
com.graphql.customermentor
├── application         # Casos de uso (Services)
├── domain              # Entidades e regras de negócio
├── infrastructure
│   ├── database        # Implementação do repositório com MongoDB
│   └── graphql         # Schemas, resolvers e inputs/outputs GraphQL
├── configuration       # Configurações gerais (MongoDB, GraphQL, CORS, etc.)
└── CustomerMentorApplication.java
```

---

## 🧾 Schema GraphQL - Cliente

```graphql
type Cliente {
  id: ID!
  nome: String!
  email: String!
  documento: String!
}

input ClienteInput {
  nome: String!
  email: String!
  documento: String!
}

type Query {
  clientePorId(id: ID!): Cliente
  clientes: [Cliente!]!
}

type Mutation {
  criarCliente(input: ClienteInput!): Cliente
  atualizarCliente(id: ID!, input: ClienteInput!): Cliente
}
```

---

## 👥 Público-alvo

Este projeto é ideal para:

- 👨‍🏫 Mentores técnicos que desejam uma base de ensino prática;
- 👨‍💻 Desenvolvedores trainees aprendendo sobre GraphQL, MongoDB e arquitetura limpa;
- 💼 Equipes de onboarding técnico em backend Java.

---

## 🛠️ Como Executar o Projeto

### Pré-requisitos

- Java 17 ou superior
- MongoDB em execução (local ou Atlas)
- Maven 3+

### Comandos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/customermentor.git
cd customermentor

# Execute a aplicação
./mvnw spring-boot:run
```

A aplicação estará disponível em:

📍 GraphQL Playground: [http://localhost:8081/graphql](http://localhost:8081/graphql)

> **Obs:** A porta da aplicação foi configurada como `8081` no arquivo `application.properties`:
>
> ```properties
> server.port=8081
> ```

---

## ✅ Próximos Passos

- [ ] Adicionar autenticação com JWT
- [ ] Criar módulos de Produto e Pedido
- [ ] Implementar fluxo de status de pedido
- [ ] Adicionar testes de integração
- [ ] Disponibilizar exemplos no Postman

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

---

**Desenvolvido com ❤️ para ajudar novos talentos a iniciarem sua jornada no backend Java.**
