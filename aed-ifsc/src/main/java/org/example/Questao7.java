package org.example;

import java.util.Scanner;

/**
 *  7.Desenvolva um algoritmo que receba o número real,
 *  correspondente ao salário de um funcionário de uma empresa, e calcule o novo
 * salário, sabendo que houve um aumento de 6% no salário.
 */
public class Questao7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salario = scanner.nextDouble();

        double novoSalario = salario * 1.06;

        System.out.printf("O novo salário com aumento de 6%% é: R$ %.2f%n", novoSalario);

        scanner.close();
    }
}
