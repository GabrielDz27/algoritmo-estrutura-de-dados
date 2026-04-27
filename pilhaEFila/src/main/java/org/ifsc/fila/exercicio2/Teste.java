package org.ifsc.fila.exercicio2;

import org.ifsc.fila.utils.Aluno;

public class Teste {
    public static void main(String[] args) {
        Fila filaDeAlunos = new Fila();
        Aluno aluno = new Aluno();
        filaDeAlunos.insere(aluno);
        Object alunoRemovido = filaDeAlunos.remove();

        if (aluno != alunoRemovido) {
            System.out
                    .println("Erro: o aluno removido não é igual ao que foi inserido");
        }
        if (!filaDeAlunos.vazia()) {
            System.out.println("Erro: A fila não está vazia");
        }
    }
}
