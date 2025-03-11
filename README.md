# ContaBanco

Este é um projeto simples de terminal em **Java** que simula a criação de uma conta bancária, solicitando ao usuário informações básicas como **número da conta, agência, nome do cliente e saldo**.

## 🛠️ Tecnologias Utilizadas

- Java
- Scanner (para entrada de dados)
- IntelliJ IDEA (IDE recomendada)

## 🚀 Como Executar o Projeto

1. **Clone o repositório:**

   ```sh
   git clone https://github.com/diegoliveiraa/ContaBanco.git
   ```

2. **Acesse o diretório do projeto:**

   ```sh
   cd ContaBanco
   ```

3. **Compile o código:**

   ```sh
   javac -d out src/org/example/ContaTerminal.java
   ```

4. **Execute o programa:**

   ```sh
   java -cp out org.example.ContaTerminal
   ```

## 📌 Funcionalidades

- Solicita ao usuário as informações da conta bancária.
- Exibe uma mensagem personalizada confirmando a criação da conta.

## 📖 Exemplo de Uso

**Entrada no terminal:**

```
Por favor, digite o número da Conta !
1234
Por favor, digite o número da Agência !
001
Por favor, digite o nome do Cliente !
João
Por favor, digite o saldo da Conta !
1500.50
```

**Saída esperada:**

```
Olá João, obrigado por criar uma conta em nosso banco, sua agência é 001, conta 1234 e seu saldo 1500.5 já está disponível para saque.
```

## 🔥 Melhorias Futuras

- Implementar validação de entrada para evitar erros.
- Melhorar a interface de entrada/saída.
- Criar uma versão gráfica usando Java Swing ou JavaFX.

## 📌 Autor

Desenvolvido por [Diego Oliveira](https://github.com/diegoliveiraa).

