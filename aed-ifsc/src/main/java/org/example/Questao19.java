package org.example;

import java.util.Scanner;

/**
 * 19 . Desenvolva um algoritmo que leia três números inteiros informados pelo usuário e utilize estruturas condicionais para identificar qual deles
 * é o maior. Ao final da execução, o algoritmo deve mostrar na tela qual é o maior número entre os três valores digitados.
 * */
public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scanner.nextInt();

        int maior;

        if (a >= b && a >= c) {
            maior = a;
        } else if (b >= a && b >= c) {
            maior = b;
        } else {
            maior = c;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();

    }
}