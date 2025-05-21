
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
