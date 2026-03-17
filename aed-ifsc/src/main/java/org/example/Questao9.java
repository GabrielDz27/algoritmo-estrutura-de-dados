package org.example;

import java.util.Scanner;

/**
 * 9. Desenvolva um algoritmo que leia um valor de hora (uma variável para a hora e outra para o minuto) e informe quantos minutos se
 * passaram desde o início do dia.
 */
public class Questao9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();

        System.out.print("Digite os minutos (0 a 59): ");
        int minuto = scanner.nextInt();

        int minutosTotais = (hora * 60) + minuto;

        System.out.println("Minutos passados desde o início do dia: " + minutosTotais);

        scanner.close();
    }

}
