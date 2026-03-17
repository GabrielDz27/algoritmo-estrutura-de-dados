package org.example;

import java.util.Scanner;

/**
 * 11. Sabe-se que, para iluminar 1 metro quadrado de um
 * ambiente, são necessários 18W de potência.
 * Desenvolva um algoritmo que leia
 * a largura e a profundidade de
 * uma sala e informe a potência da lâmpada que
 * deve ser usada.
 */
public class Questao11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual a largura da sala?");
        double largura = s.nextDouble();
        System.out.println("Qual a profundidade da sala?");
        double profundidade = s.nextDouble();
        double area = largura * profundidade;
        double totalW = area * 18;
        System.out.printf("Para iluminar uma sala de " +
                "%.2f m² é preciso uma lâmpada de %.2fW",
                area,
                totalW);
    }
}
