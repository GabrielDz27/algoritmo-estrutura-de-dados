package org.example;

import java.util.Scanner;

/**
 * 2. Desenvolva um algoritmo que leia o ano de nascimento,
 * o ano atual e diga qual é a sua idade.
 */
public class Questao2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual ano do nascimento:");
        int anoNascimento = s.nextInt();
        System.out.println("Qual ano do atual:");
        int anoAtual = s.nextInt();
        int idade = anoAtual-anoNascimento;
        System.out.printf("Idade %s anos", idade);
    }
}
