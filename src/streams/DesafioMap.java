package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Function<Integer, String> binario =
                Integer::toBinaryString;

        UnaryOperator<String> inverter =
                n -> new StringBuilder(n).reverse().toString();

        Function<String, Integer> binarioInt = n -> Integer.parseInt(n,2 );
        // ele precisa do 2 como parametro pra entender que esta recebendo valor inteiro
        // do binario, caso fosse um numero decimal seria 10 e hexadecimal 16.

        nums.stream()
                .map(binario)
                .map(inverter)
                .map(binarioInt)
                .forEach(System.out::println);


    }
}
