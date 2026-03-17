package org.example;

import java.util.Scanner;

/**
 * 4. Desenvolva um algoritmo que leia 3 notas
 * e calcule e mostre a média aritmética entre elas.
 */
public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nota 1");
        int nota1 = s.nextInt();
        System.out.println("Nota 2");
        int nota2 = s.nextInt();
        System.out.println("Nota 3");
        int nota3 = s.nextInt();
        //mediaInt vai ser calculada sem casa decimal
        int mediaInt = (nota1+nota2+nota3)/3;
        //para transformar um número em float pode adicionar
        //o f no final
        float media = (nota1+nota2+nota3)/3.0f;
        //números com .0 outra casa decimal, são naturalmente
        //double
        double media2 = (nota1+nota2+nota3)/3.0;
        System.out.printf("Média 1 = %s  \n", mediaInt);
        System.out.printf("Média 2 = %.2f\n", media);
        System.out.printf("Média 3 = %.2f\n", media2);
    }
}
