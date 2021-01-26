package streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Mercado p1 = new Mercado(4, 4.76, "Fandangos", true);
        Mercado p2 = new Mercado(1, 19.85, "Contra-Filé", true);
        Mercado p3 = new Mercado(10, 7.65, "Coca-Cola", true);
        Mercado p4 = new Mercado(4, .99, "Danone", false);
        List<Mercado> compras = Arrays.asList(p1, p2, p3, p4);

        Predicate<Mercado> vaiLevar =
                p -> (p.getPreco() * p.getQuantidade()) <= 20 && p.isDisponivel();

        Function<Mercado, String> levaras =
                p -> "Vou levar " + p.getNome()
                        + " que vai totalizar R$"
                        + Double.parseDouble(String.format("%.2f", p.getPreco() * p.getQuantidade()));

        compras.stream()
                .filter(vaiLevar)
                .map(levaras)
                .forEach(System.out::println);
    }
}
