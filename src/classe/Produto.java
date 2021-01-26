package classe;

public class Produto { // classe

    String nome;
    double preco;
    double desconto;

    Produto () {

    } //contstrutor sem parâmetros de inicialização, existe de forma implícita

    Produto (String nomeInicial, double precoInicial,
             double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    } // construtor com parâmetros que exige três valores pra iniciar a classe


    double precoComDesconto () {

        return preco * (1 - desconto);
    } // método retornando um argumento (valor)
}
