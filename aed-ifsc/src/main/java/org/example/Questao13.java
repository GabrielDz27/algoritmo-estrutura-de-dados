package org.example;

import java.util.Scanner;

/**
 * 13. Desenvolva um algoritmo que leia um número inteiro
 * que corresponda a uma data no formato ddmmaaaa e imprima
 * cada valor separado. Por exemplo: se o usuário informar
 * 19042003 o algoritmo deverá mostrar 19 de 04 de 2003.
 */
public class Questao13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual a data ddmmyyyy?");
        String data = s.nextLine();
        String dia = data.substring(0,2);
        String mes = data.substring(2,4);
        String ano = data.substring(4);
        System.out.printf("%s de %s de %s", dia, mes, ano);

    }
}
