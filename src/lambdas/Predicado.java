package lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        Predicate<Produto> isCaro =
                prod -> (prod.preco * (1 - prod.desconto)) >= 750;
                /// Caso o produto com desconto seja maior que 750 ele retorna true


        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));

    }
}
