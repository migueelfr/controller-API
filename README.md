# Controller-API 🚀

Uma API simples em **Java** com **Spring Boot** para gerenciar controladores de forma eficiente. Oferece operações CRUD (Criar, Ler, Atualizar, Deletar) para controladores.

## Funcionalidades 🔧

- **Criar** novos controladores
- **Consultar** controladores existentes
- **Atualizar** informações dos controladores
- **Deletar** controladores do sistema

## Tecnologias 🛠️

- **Java** 17+
- **Spring Boot**
- **Maven**

## Como Rodar 🏃‍♂️

1. Clone o repositório:
   ```bash
   git clone https://github.com/migueelfr/controller-API.git
   ```
2. Navegue até a pasta do projeto:
   ```bash
   cd controller-API
   ```
3. Compile o projeto:
   ```bash
   mvn clean install
   ```
4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

A API estará disponível em: [http://localhost:8080](http://localhost:8080)

## Endpoints 📡

- **GET /controladores**: Lista todos os controladores
- **GET /controladores/{id}**: Detalhes de um controlador específico
- **POST /controladores**: Adiciona um novo controlador
- **PUT /controladores/{id}**: Atualiza um controlador
- **DELETE /controladores/{id}**: Deleta um controlador



