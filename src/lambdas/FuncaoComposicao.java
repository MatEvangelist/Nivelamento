package lambdas;

import java.util.function.Function;

public class FuncaoComposicao {

    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";
        // Entra um numero int e sai uma String

        System.out.println(parOuImpar.apply(33));

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;
        // Entra uma String (valor) e sai outra String

        Function<String, String> empolgado = valor -> valor + "!!!";

        Function<String, String> duvida = valor -> valor + "???";

        String resultadoFinal1 = parOuImpar
                .andThen(oResultadoE)
                .andThen(empolgado)
                .apply(32);
        // composição de funções: resultado final une as duas
        //chama parOuImpar aplicado a 32 E ENTÃO  execute oResultadoE

        System.out.println(resultadoFinal1);

        String resultadoFinal2 = parOuImpar
                .andThen(oResultadoE)
                .andThen(duvida)
                .apply(33);

        System.out.println(resultadoFinal2);
    }
}
