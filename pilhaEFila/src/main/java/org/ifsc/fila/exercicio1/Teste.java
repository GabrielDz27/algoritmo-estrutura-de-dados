package org.ifsc.fila.exercicio1;

import org.ifsc.fila.utils.Aluno;

public class Teste {
    public static void main(String[] args) {
        Fila fila = new Fila();

        Aluno aluno = new Aluno();

        fila.insere(aluno);

        Aluno alunoRemove = fila.remove();
        if (aluno != alunoRemove) {
            System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
        }
        if (!fila.vazia()) {
            System.out.println("Erro: A fila não está vazia");
        }
    }
}
