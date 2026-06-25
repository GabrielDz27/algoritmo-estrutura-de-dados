package org.ifsc;

public class Main {
    public static void main(String[] args) {
        BTree tree = new BTree(2);

        System.out.println("--- Inserindo chaves: 10, 20, 30 ---");
        tree.inserir(10);
        tree.inserir(20);
        tree.inserir(30);
        tree.printTree();
        System.out.println();

        System.out.println("--- Inserindo chave 40 (Vai forçar um Split da Raiz) ---");
        tree.inserir(40);
        tree.printTree();
        System.out.println();

        System.out.println("--- Inserindo chaves: 50, 25 ---");
        tree.inserir(50);
        tree.inserir(25);
        tree.printTree();
        System.out.println();



        System.out.println("--- Testando a Busca ---");
        int chaveParaBuscar = 25;
        Node resultado = tree.buscar(chaveParaBuscar);

        if (resultado != null) {
            System.out.println("Chave " + chaveParaBuscar + " ENCONTRADA na árvore!");
        } else {
            System.out.println("Chave " + chaveParaBuscar + " NÃO encontrada.");
        }

        chaveParaBuscar = 99;
        resultado = tree.buscar(chaveParaBuscar);
        if (resultado != null) {
            System.out.println("Chave " + chaveParaBuscar + " ENCONTRADA na árvore!");
        } else {
            System.out.println("Chave " + chaveParaBuscar + " NÃO encontrada.");
        }
    }
}
