package org.ifsc.pilha;

import java.util.Stack;

public class Teste {
    public static void main(String[] args) {
        Stack<Peca> pilha = new Stack<Peca>();

        Peca peca = new Peca();

        pilha.push(peca);

        Peca pecaRemove = (Peca)pilha.pop();

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia");
        }

        Pilha<String> pilha2 = new Pilha<String>();

        pilha2.insere("Rafael Cosentino");
        pilha2.insere("Paulo Silvera");

        String paulo = pilha2.remove();
        String rafael = pilha2.remove();

        System.out.println(paulo);
        System.out.println(rafael);
    }
}
