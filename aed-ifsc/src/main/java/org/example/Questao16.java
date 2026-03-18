package org.example;

import java.util.Scanner;

/**
 * 16. Desenvolva um algoritmo que leia três valores (a, b e c) de uma equação do segundo grau do tipo ax² + bx + c = 0 e mostre as raízes
 * dessa equação.
 * */
public class Questao16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Isso não é uma equação do segundo grau (a não pode ser 0).");
            scanner.close();
            return;
        }

        double delta = (b * b) - (4 * a * c);

        System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A equação possui uma raiz real (raiz dupla): x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        scanner.close();
    }
}
