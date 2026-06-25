package org.ifsc;

public class BTree {
    private Node root;
    private int t;

    public BTree(int t) {
        this.t = t;
        this.root = null;
    }

    public Node buscar(int chave) {
       return (this.root == null) ? null : this.root.busca(chave);
    }

    public void inserir(int chave) {
        if (this.root == null) {
            this.root = new Node(t, true);
            this.root.chaves[0] = chave;
            this.root.numeroAtual = 1;
            return;
        }


        if (this.root.numeroAtual == 2 * t - 1) {
            Node novaRaiz = new Node(t, false);
            novaRaiz.filhos[0] = this.root;

            // Divide a raiz antiga e joga uma chave para a nova raiz
            novaRaiz.dividirFilho(0, this.root);

            int i = 0;

            // Decide em qual dos dois filhos a nova chave vai entrar
            if (novaRaiz.chaves[0] < chave) {
                i++;
            }

            novaRaiz.filhos[i].inserirNaoCheio(chave);
            this.root = novaRaiz;
        } else {
            this.root.inserirNaoCheio(chave);
        }
    }

    public void printTree() {
        if (root != null) {
            printNode(root, 0);
        } else {
            System.out.println("arvore está vazia.");
        }
    }

    private void printNode(Node node, int level) {
        System.out.print("Nível " + level + " [ ");
        for (int i = 0; i < node.numeroAtual; i++) {
            System.out.print(node.filhos[i] + " ");
        }
        System.out.println("]");

        if (!node.ehFolha) {
            for (int i = 0; i <= node.numeroAtual; i++) {
                if (node.filhos[i] != null) {
                    printNode(node.filhos[i], level + 1);
                }
            }
        }
    }
}
