# 📱 IPhoneApp

Aplicação Java que simula as funcionalidades básicas de um iPhone: **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador Internet**.

## ✅ Funcionalidades

- 🎵 Gerenciamento de Playlists e Músicas.
- 📞 Realização de Chamadas, Agenda Telefônica, Discador.
- 🌐 Navegação por páginas com múltiplas abas e histórico.

## 🛠️ Tecnologias

- Java 17
- Maven
- JUnit 5 (TDD)
- Lombok

## 🚀 Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/iphone-app.git
cd iphone-app
```

2. Compile e rode os testes:

```bash
mvn clean install
mvn test
```

3. Execute a aplicação:

```bash
mvn exec:java -Dexec.mainClass="com.iphone.app.IPhoneApp"
```

## ✅ Estrutura de código

- **model**: Entidades do domínio.
- **service**: Interfaces e implementações.
- **ui**: Interface de usuário.
- **test**: Testes unitários.

## ✅ Boas práticas

- Programação Orientada a Objetos (POO).
- Desenvolvimento Orientado a Testes (TDD).
- Modularização e separação de responsabilidades.

📄 Licença
MIT.

Desenvolvido com ❤️ e TDD.