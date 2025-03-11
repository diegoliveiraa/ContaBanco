package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da Conta !");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+nomeCliente+", obrigado por criar " +
                "uma conta em nosso banco, sua agência é "+agencia+", " +
                "conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}