package org.example;

import java.util.Scanner;

/**
 * 10. Desenvolva um algoritmo que receba um número inteiro e mostre o dígito das unidades desse número.
 */
public class Questao10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int unidades = numero % 10;

        System.out.println("O dígito das unidades é: " + unidades);

        scanner.close();
    }
}
