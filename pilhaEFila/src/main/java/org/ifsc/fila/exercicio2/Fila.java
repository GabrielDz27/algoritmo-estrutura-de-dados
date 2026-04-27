package org.ifsc.fila.exercicio2;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<Object> objetos = new LinkedList<Object>();

    public void insere(Object object) {
        this.objetos.add(object);
    }

    public Object remove() {
        return this.objetos.remove(0);
    }

    public boolean vazia() {
        return this.objetos.size() == 0;
    }
}
