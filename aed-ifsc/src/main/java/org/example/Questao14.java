package org.example;

import java.util.Scanner;

/**
 * 14. João tem um problema com os números. ele sempre escreve números de quatro algarismos de trás para a frente (o número 1234 ele
 * escreve 4321). Escreva um algoritmo que imprima invertidos os números de 4 algarismos.
 * */
public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 4 algarismos: ");
        int numero = scanner.nextInt();

        int unidade = numero % 10;
        int dezena = (numero / 10) % 10;
        int centena = (numero / 100) % 10;
        int milhar = numero / 1000;

        int invertido = unidade * 1000 + dezena * 100 + centena * 10 + milhar;

        System.out.println("Número invertido: " + invertido);

        scanner.close();
    }
}
