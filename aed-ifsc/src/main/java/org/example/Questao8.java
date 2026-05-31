package org.example;

import java.util.Scanner;

/**
 * 8. Desenvolva um algoritmo que receba o salário-base de um funcionário e calcule quanto ele deve receber. Sabe-se que o funcionário tem
 * uma gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o salário-base.
 */

public class Questao8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário-base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        double gratificacao = salarioBase * 0.05;
        double imposto = salarioBase * 0.07;

        double salarioFinal = salarioBase + gratificacao - imposto;

        System.out.printf("O salário final do funcionário é: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}
