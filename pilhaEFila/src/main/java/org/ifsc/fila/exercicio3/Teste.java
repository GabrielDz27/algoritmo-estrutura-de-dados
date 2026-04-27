package org.ifsc.fila.exercicio3;

import org.ifsc.fila.utils.Aluno;

public class Teste {
    public static void main(String[] args) {
        Fila<Aluno> filaAlunos = new Fila<Aluno>();

        Aluno aluno = new Aluno();
        aluno.setNome("Gabriel");

        filaAlunos.insere(aluno);

        Aluno alunoRemovido = filaAlunos.remove();

        if (aluno != alunoRemovido) {
            System.out.println("Erro: o aluno removido não é igual ao que foi inserido");
        }

        System.out.printf("Aluno[0]: " + alunoRemovido.getNome());

        if (!filaAlunos.vazia()) {
            System.out.println("Erro: A fila não está vazia");
        }

        Fila<String> filaDeString = new Fila<String>();
        filaDeString.insere("Rafael Cosentino");
        filaDeString.insere("Paulo Silveira");

        System.out.println(filaDeString.remove());
        System.out.println(filaDeString.remove());
    }
}
