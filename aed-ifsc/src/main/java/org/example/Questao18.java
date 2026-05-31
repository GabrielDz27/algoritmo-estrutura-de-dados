package org.example;

import java.util.Scanner;

/**
 * 18. Desenvolva um algoritmo que leia um número inteiro informado pelo usuário e verifique se o número é par ou ímpar. Após a verificação, o
 * algoritmo deve exibir uma mensagem informando se o número digitado é par ou ímpar.
 * */
public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        scanner.close();

    }
}
