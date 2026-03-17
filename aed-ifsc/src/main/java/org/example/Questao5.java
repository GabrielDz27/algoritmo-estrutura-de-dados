package org.example;

import java.util.Scanner;

/**
 * 5. Desenvolva um algoritmo que leia 2 notas e
 * calcule a nota final do aluno.
 * Considere a média ponderada, onde a primeira
 * nota tem peso 4 e a segunda tem peso 6.
 */
public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nota 1");
        double nota1 = s.nextDouble();
        System.out.println("Nota 2");
        double nota2 = s.nextDouble();
        double media = (nota1*4+nota2*6)/10;
        System.out.printf("Média ponderada: %.2f\n",media);
    }
}
