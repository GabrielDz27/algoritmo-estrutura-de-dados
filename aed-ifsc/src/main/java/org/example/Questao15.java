package org.example;

import java.util.Scanner;

/**
 * 15. Um vendedor de uma loja recebe um salário fixo por mês, paga imposto de 6% sobre o fixo, e recebe uma comissão de 5% sobre o total
 * de suas vendas. Desenvolva um algoritmo que leia o salário fixo, o total de vendas no mês e informe quanto esse vendedor deve receber.
 */
public class Questao15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o total de vendas no mês: ");
        double totalVendas = scanner.nextDouble();

        double imposto = salarioFixo * 0.06;
        double comissao = totalVendas * 0.05;

        double salarioFinal = salarioFixo - imposto + comissao;

        System.out.printf("O salário final do vendedor é: R$ %.2f%n", salarioFinal);

        scanner.close();
    }
}

