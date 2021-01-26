package classe;

public class DesafioProduto {

    String nome;
    double preco;
    static double desconto = 0.25;

    DesafioProduto () {
    }

    DesafioProduto (String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto () {
        return preco * (1- desconto);
    }

    double precoComDesconto (double descontoDoGerente) {
        return preco * (1- desconto + descontoDoGerente);
    }



}
