<div align="center">
  <h1> RESTful API Bancária</h1>
  <img src="https://img.shields.io/badge/JAVA-ED8B00?style=flat&logo=openjdk&logoColor=white">
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat&logo=spring&logoColor=white">
  <img src="https://img.shields.io/badge/-Swagger-%23Clojure?style=flat&logo=swagger&logoColor=white">
  <img src="https://img.shields.io/badge/PostgreSQL-316192?style=flat&logo=postgresql&logoColor=white">
</div>

## 📘 Sobre
RESTful API Bancária do Santander.

## 💻 Tecnologias
- Java 17 (OpenJDK 17)
- Spring Boot 3
- Spring Data JPA
- Swagger
- H2 Database Engine
- PostgreSQL
- Railway
- Figma

## [Link do Figma](https://www.figma.com/file/0ZsjwjsYlYd3timxqMWlbj/SANTANDER---Projeto-Web%2FMobile?type=design&node-id=1421%3A432&mode=design&t=6dPQuerScEQH0zAn-1)

O Figma foi utilizado para a abstração do domínio desta API, sendo útil na análise e projeto da solução.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

## ✅ Funcionalidades
- [x] Cadastro de usuários
- [x] Atualização de informações do usuários
- [x] Deleção de usuários

### Rodar a aplicação localmente
1 - Clonar o repositório `git clone https://github.com/elainefs/santander-bootcamp-2023.git`

2 - Entrar na pasta do projeto `cd restful-api`

3 - Rodar `gradle install` para instalar as dependências

4 - Rodar `gradle bootRun` para subir a aplicação

5 - A aplicação estará disponível na porta `localhost:8080`

6 - Use um Cliente de requisições HTTP para fazer os testes 

## 📄 Licença
Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](/LICENSE) para obter mais detalhes.

<hr>

Made with ❤️ by [Elaine Ferreira](https://github.com/elainefs)