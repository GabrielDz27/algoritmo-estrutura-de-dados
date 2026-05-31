package org.example;

import java.util.Scanner;

/**
 * 17. Maria precisa informa ao sistema de controle de notas as notas dos alunos, porém as notas estão em ordem invertida. Desenvolva um
 * algoritmo que dada duas notas armazenadas nas variáveis a e b, inverta os valores de a e b (o valor que estava na variável a vai para a
 * variável b e o que estava na variável b vai para a variável a).
 * */
public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite a nota B: ");
        double b = scanner.nextDouble();

        System.out.println("\nAntes da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        double aux = a;
        a = b;
        b = aux;

        System.out.println("\nDepois da troca:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close();

    }
}
