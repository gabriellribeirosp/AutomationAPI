# 🧪 AutomationAPI

Projeto de automação de testes de API utilizando **Java**, **JUnit 5** e **Rest Assured**.

---

## 🔧 Tecnologias Utilizadas

- Java 17+
- Maven
- JUnit 5
- Rest Assured
- JSONPlaceholder (API fake para testes)

---

## 📁 Estrutura do Projeto

```
src
├── main
│   └── java
│       └── br.com.outsera  # (caso exista lógica de app)
└── test
    └── java
        └── Tests
            ├── GetPostTest.java
            ├── PostTest.java
            ├── PutTest.java
            └── DeleteTest.java
```

---

## 🚀 Como executar os testes

### 1. Clone o repositório

```bash
git clone https://github.com/gabriellribeiroosp/AutomationAPI.git
cd AutomationAPI
```

### 2. Execute os testes com Maven

```bash
mvn clean test
```

---

## ✅ Cenários Testados

- `GET /posts/1` – Validação de dados retornados
- `POST /posts` – Criação de post com dados válidos e inválidos
- `PUT /posts/1` – Atualização com ID válido e inválido
- `DELETE /posts/1` – Exclusão de post existente e inexistente

> ⚠️ Os testes com falhas esperadas foram ajustados para refletirem o comportamento real da API `jsonplaceholder.typicode.com`, que é permissiva mesmo em requisições inválidas.

---

## 📦 Requisitos

- Java JDK 17+
- Maven 3.8+

---

## 📄 Licença

Este projeto é livre para uso educacional e profissional.
