# AutomationAPI

Este projeto realiza testes automatizados de API utilizando **Java + RestAssured + JUnit**.

## Estrutura dos Testes

Localização dos testes: `src/test/java/Tests`

### Testes Positivos

- **PostTest**: Criação de posts válidos.
- **GetPostTest**: Consulta de posts existentes.
- **PutTest**: Atualização de posts com dados válidos.
- **DeleteTest**: Remoção de posts existentes.

### Testes Negativos

- **PostTest**
  - `criarPostComDadosInvalidos`: Tenta criar um post com corpo inválido.
- **GetPostTest**
  - `validarGetDePostInexistente`: Consulta de post inexistente, espera-se 404.
- **PutTest**
  - `atualizarPostComIdInvalido`: Envio de atualização com ID inválido (string).
- **DeleteTest**
  - `deletarPostInexistente`: Tenta deletar um post inexistente.

## Execução dos Testes

1. Requisitos:
   - Java 11+
   - Maven

2. Para rodar os testes:
```bash
mvn clean test
```

## Relatórios

Relatórios são gerados automaticamente em:
```
target/surefire-reports/
```

## Autor

Gabriel Lopes Ribeiro