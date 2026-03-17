package org.example;

import java.util.Scanner;

/**
 *3. Desenvolva um algoritmo que leia dois
 *  números inteiros quaisquer e imprima a soma dos mesmos.
 */
public class Questao3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual o primeiro número:");
        int primeiro = s.nextInt();
        System.out.println("Qual o segundo número:");
        int segundo = s.nextInt();
        int soma = primeiro+segundo;
        System.out.printf("%s + %s = %s",
                primeiro, segundo,soma);
    }
}
