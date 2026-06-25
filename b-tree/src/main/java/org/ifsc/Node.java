package org.ifsc;

public class Node {
    int[] chaves; // Array que armazena as chaves
    int T; // Grau mínimo (define o intervalo de chaves)
    Node[] filho; // Array de ponteiros para os filhos
    int numeroAtual; //Número atual de chaves no nó
    boolean ehFolha; // True se o nó for folha

    public Node(int t, boolean ehFolha) {
        this.chaves = new int[2* T-1];
        T = t;
        this.filho = new Node[2 * T];
        this.numeroAtual = 0;
        this.ehFolha = ehFolha;
    }

    //Funçao auxiliar pra buscar a chave na subarvore do no

    //
    public Node busca(int chave) {
        int i = 0;

        while (i < numeroAtual && chave > this.chaves[i]) {
            i++;
        }

        if (i < numeroAtual && chaves[i] == chave) {
            return this;
        }

        if (ehFolha) {
            return null;
        }

        return filho[i].busca(chave);
    }
}
