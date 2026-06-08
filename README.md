# Sistema de Gestão de Eventos Acadêmicos

Projeto desenvolvido para a disciplina de Projeto de Programação utilizando Java, Maven, DDD, TDD e GitHub Actions.

## Tema Escolhido

Tema 6 - Plataforma de Gestão de Eventos Acadêmicos e Emissão de Certificados.

## Tecnologias Utilizadas

* Java 21
* Maven
* JUnit 5
* GitHub Actions

## Estrutura do Projeto

src/

* domain → Entidades, Value Objects e Aggregate Root
* application → Casos de uso da aplicação
* infrastructure → Repositórios e componentes externos

tests/

* Testes unitários das regras de negócio

## Funcionalidades

* Cadastro de participantes
* Controle de limite de vagas
* Validação de participantes duplicados
* Inscrição em eventos

## Executando os Testes

```bash
mvn test
```

## Integração Contínua

O projeto utiliza GitHub Actions para executar automaticamente os testes a cada push ou pull request.
