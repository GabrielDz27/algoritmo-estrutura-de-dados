package org.ifsc;

public class Node {
    int[] chaves; // Array que armazena as chaves
    int t; // Grau mínimo (define o intervalo de chaves)
    Node[] filhos; // Array de ponteiros para os filhos
    int numeroAtual; //Número atual de chaves no nó
    boolean ehFolha; // True se o nó for folha

    public Node(int t, boolean ehFolha) {
        this.chaves = new int[2* t-1];
        this.t = t;
        this.filhos = new Node[2 * t];
        this.numeroAtual = 0;
        this.ehFolha = ehFolha;
    }

    //Funçao auxiliar pra buscar a chave na subarvore do no
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

        return filhos[i].busca(chave);
    }

    public void dividirFilho(int i, Node root) {
        Node novoNo = new Node(root.t, root.ehFolha);
        novoNo.numeroAtual = t - 1;

        // copia a segunda metade das chaves do filho cheio para o novo filho
        for (int j = 0; j < t - 1; j++) {
            novoNo.chaves[j] = root.chaves[j + t];
        }

        if (!root.ehFolha) {
            for (int j = 0; j < t; j++) {
                novoNo.filhos[j] = root.filhos[j + t];
            }
        }

        root.numeroAtual = t - 1; // reduz o número de chaves no filho antigo

        //abre espaço no pai para o novo filho
        for (int j = numeroAtual; j >= i + 1; j--) {
            filhos[j + 1] = filhos[j];
        }

        filhos[i + 1] = novoNo;

        // abre espaço no pai para a chave que vai subir
        for (int j = numeroAtual - 1; j >= i; j--) {
            chaves[j + 1] = chaves[j];
        }

        chaves[i] = root.chaves[t - 1];
        numeroAtual++;
    }

    public void inserirNaoCheio(int chave) {
        int i = numeroAtual - 1;

        if (ehFolha) {
            // Quando é folha vai ir na posição correta para nova chave e move as maiores
            while (i >= 0 && chaves[i] > chave) {
                chaves[i + 1] = chaves[i];
                i--;
            }

            chaves[i + 1] = chave;
            numeroAtual++;
        } else {
            //encontra o filho que vai receber a chave
            while (i >= 0 && chaves[i] > chave) {
                i--;
            }
            i++;

            //se o filho estiver cheio, divide ele primeiro
            if (filhos[i].numeroAtual == 2 * t - 1) {
                dividirFilho(i, filhos[i]);

                if (chaves[i] < chave) {
                    i++;
                }
            }
            filhos[i].inserirNaoCheio(chave);
        }
    }
}
