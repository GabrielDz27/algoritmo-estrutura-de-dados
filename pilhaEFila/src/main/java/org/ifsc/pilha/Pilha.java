package org.ifsc.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> {
    private List<T> objetos = new LinkedList<T>();

    //insere a peca no topo da pilha
    public void insere(T t) {
        this.objetos.add(t);
    }

    //remove a peca no topo da pilha
    public T remove() {
        return this.objetos.remove(this.objetos.size() -1);
    }

    //diz se ta vazia a pilha o não
    public boolean vazia() {
        return this.objetos.size() == 0;
    }

}
