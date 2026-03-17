package org.example;

import java.util.Scanner;

/**
 * 1. Leia o seu nome e sobrenome separados e
 * informe em um único resultado a junção dos dois.
 */
public class Questao1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual seu primeiro nome:");
        String nome = s.nextLine();
        System.out.println("Qual seu sobrenome:");
        String sobrenome = s.nextLine();
        System.out.println(nome + " " + sobrenome);
        System.out.printf("%s %s\n", nome, sobrenome);
        //A partir do java 25
        //String nome = IO.readline("Qual seu 1o nome");
        //String sobrenome = IO.readline("Qual seu sobrenome");
        //System.out.printf("%s %s\n", nome, sobrenome);

    }
}
