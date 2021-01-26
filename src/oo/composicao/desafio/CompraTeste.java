package oo.composicao.desafio;

public class CompraTeste {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Mathews Evangelista");

        Compra compra1 = new Compra();
        compra1.adicionarItem("Maconha", 10.00, 5);
        compra1.adicionarItem(new Produto("Cocaína", 20.00), 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lança Perfume", 20.00, 7);
        compra2.adicionarItem(new Produto("Xanax", 50.0), 3);

        cliente1.adicionarCompra(compra1);
        cliente1.adicionarCompra(compra2);

        System.out.println(cliente1.obterValorTotal());
    }
}
