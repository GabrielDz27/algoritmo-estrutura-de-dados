package org.example;

import java.util.Scanner;

/**
 * 12. Considerando o exercício anterior e sabendo-se que só existem lâmpadas de 60W de potência, desenvolva um algoritmo que, dada a
 * largura e profundidade da sala, diga quantas lâmpadas de 60W são necessárias para iluminá-la.
 */
public class Questao12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da sala (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a profundidade da sala (em metros): ");
        double profundidade = scanner.nextDouble();

        double area = largura * profundidade;
        double potenciaNecessaria = area * 18;
        int quantidadeLampadas = (int) Math.ceil(potenciaNecessaria / 60);

        System.out.println("Área da sala: " + area + " m²");
        System.out.println("Potência necessária: " + potenciaNecessaria + "W");
        System.out.println("Quantidade de lâmpadas de 60W necessárias: " + quantidadeLampadas);

        scanner.close();
    }
}
