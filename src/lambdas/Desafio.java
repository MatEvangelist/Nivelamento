package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static java.lang.Double.parseDouble;

        //BinaryOperator<Double> Descontando =
                //(Double n1, Double n2) -> n1 + (1 - n2);


        //double precoDesconto = Descontando.apply(p.getPreco(), p.getDesconto());
        // System.out.printf("O preço com desconto do(a) %s é R$%.2f,\n",p.getNome(), precoDesconto);


        //double precoImposto = impostoEmCima.apply(precoDesconto);
        // System.out.printf("adicionando o valor dos impostos, o valor fica igual a R$%.2f,\n", p.getNome(), precoImposto);


        //double precoFrete = frete.apply(precoImposto);
        // System.out.printf(" mais o valor do frete, o valor é igual a R$.2f", precoFrete);



public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad", 3235.89, 0.13);


        Function<Produto, Double> precoFinal = n -> n.preco * (1 - n.desconto);


        UnaryOperator<Double> impostoEmCima = n -> n >= 2500? n * 1.085 : n;


        UnaryOperator<Double> frete = n -> n >= 3000 ? n + 100 : n +50;


        UnaryOperator<Double> arredondar = n -> Double.parseDouble(String.format("%.2f", n));


        Function<Double, String> formatar = n -> ("R$" + n).replace(".", ",");



        String preco = precoFinal.andThen(impostoEmCima).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
        System.out.println("O preço final é " + preco);
    }
}
