# Food Management Application
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto

Este projeto é uma aplicação backend desenvolvida com Spring Boot e Spring Security, que permite a criação e o gerenciamento de tipos de comida. A aplicação utiliza Flyway para gerenciamento de migrações de banco de dados, JWT para autenticação e autorização, e PostgreSQL como banco de dados, que é executado dentro de um container Docker.

# Funcionalidades
- Cadastro e login de usuários: Os usuários podem se registrar e fazer login utilizando JWT.
- Criação de tipos de comida: A aplicação permite o registro e salvamento de diferentes tipos de comida no banco de dados.
- Controle de acesso: O acesso às funcionalidades é controlado por roles (papéis) de usuário, sendo possível definir permissões para USER e ADMIN.
- Migrações de banco de dados: Utiliza o Flyway para garantir que as tabelas necessárias (food e user_tb) sejam criadas automaticamente se não existirem no banco de dados.

# Tecnologias utilizadas
- Spring Boot: Framework Java para desenvolvimento de aplicações backend.
- Spring Security: Para autenticação e autorização de usuários.
- JWT: Para criação e validação de tokens de acesso.
- Flyway: Para gerenciamento e execução de migrações de banco de dados.
- PostgreSQL: Banco de dados relacional.
- Docker: Utilizado para containerizar o banco de dados PostgreSQL.

# Como executar o projeto
## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Docker (para executar o banco de dados PostgreSQL em um container)
- Maven (para construção do projeto)


```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/food-management-application.git

# entrar na pasta do projeto back end
cd food-management-application

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
