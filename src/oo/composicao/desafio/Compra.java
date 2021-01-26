package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final ArrayList<Item> listaItens = new ArrayList<>();

    void adicionarItem(Produto p, int qtde) {
        this.listaItens.add(new Item(p, qtde));
    }

//    void adicionarItem(String nome, double preco, int qtde) {
//        this.listaItens.add(new Item(new Produto(nome, preco), qtde));
//    }

    void adicionarItem(String nome, double preco, int qtde) {
        Produto produto = new Produto(nome, preco);
        this.listaItens.add(new Item(produto, qtde));
    }


    double obterValorTotal() {
        double total = 0;

        for (Item item: listaItens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }

}
