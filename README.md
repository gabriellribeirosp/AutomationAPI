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
=======

# AutomationAPI

Este é um projeto de automação de testes de API desenvolvido em Java, utilizando Maven como sistema de build e o framework JUnit para testes automatizados.

## 📦 Estrutura do Projeto

```
AutomationAPI/
├── src/
│   ├── main/java/br/com/outsera/Main.java
│   └── test/java/Tests/
│       ├── GetPostTest.java
│       ├── PostTest.java
│       ├── PutTest.java
│       └── DeleteTest.java
├── pom.xml
└── target/ (arquivos gerados)
```

## 🚀 Tecnologias Utilizadas

- Java 11+
- Maven
- JUnit
- Surefire Plugin (relatórios de teste)
- Git

## ✅ Como Executar os Testes

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/AutomationAPI.git
   cd AutomationAPI
   ```

2. Compile o projeto:
   ```bash
   mvn clean compile
   ```

3. Execute os testes:
   ```bash
   mvn test
   ```

4. Veja os relatórios em:
   ```
   target/site/surefire-report.html
   ```

## 📁 Observações

- O projeto contém exemplos de testes para requisições GET, POST, PUT e DELETE.
- É ideal para iniciantes em automação de testes de API com Java.
- Possui estrutura modular e extensível para outros testes.

## 📜 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
>>>>>>> d39547034c1b6de95a5f7365ec668baa95b80706
