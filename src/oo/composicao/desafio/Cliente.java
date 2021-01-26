package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> listaCompra = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompra(Compra c) {
        this.listaCompra.add(c);
    }

    double obterValorTotal() {
        double total = 0;
        for(Compra compra: listaCompra) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
