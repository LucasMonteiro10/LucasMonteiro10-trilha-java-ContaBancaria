package edu.lucas.desafioconta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        numero = Integer.parseInt(scan.nextLine());

        System.out.println("Por favor, digite a Agência:");
        agencia = scan.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        saldo = Float.parseFloat(scan.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scan.close();
    }
}
