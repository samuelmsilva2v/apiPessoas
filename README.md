# Pessoas API

 API RESTful desenvolvida com Spring Boot para cadastrar pessoas e demonstrar o funcionamento de mensageria entre duas APIs.

 ## Tecnologias utilizadas:
 * Java 21
 * Spring Boot
 * Maven
 * JPA / Hibernate
 * Swagger
 * H2
 * RabbitMQ

## Funcionalidade:
Ao realizar o cadastro de uma pessoa utilizando o e-mail, os dados são enviados para uma fila no RabbitMQ. Esses dados são posteriormente consumidos pela API de Notificações, que processa as informações e dispara um e-mail de boas-vindas ao usuário.

## Como executar o projeto:

### Requisitos
* Java 21+
* Spring Boot 3.4.0+
* Um servidor de mensageria no CloudAMQP

#### 1. Clone o repositório
```bash
   git clone https://github.com/samuelmsilva2v/apiPessoas.git
   cd apiPessoas
```
#### 2. Instale as dependências e compile o projeto com Maven:
```bash
./mvnw clean install
```
#### 3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

A aplicação vai rodar em http://localhost:8080/swagger-ui/index.html#

#### Observação:
Caso necessário configure o servidor de mensageria no `app.properties`
```properties
spring.rabbitmq.host=
spring.rabbitmq.port=5672
spring.rabbitmq.username=
spring.rabbitmq.password=
spring.rabbitmq.virtual-host=
```
