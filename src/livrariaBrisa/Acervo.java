package livrariaBrisa;

import java.util.ArrayList;

public class Acervo {

    private static ArrayList<Livro> AcervoLivros = new ArrayList<>();

    public ArrayList<Livro> getAcervoLivros() {
        return AcervoLivros;
    }

    static public void adicionarLista(Livro liv) {
        AcervoLivros.add(liv);
    }

    static public String listar() {
        StringBuilder lista = new StringBuilder();
        System.out.println("---------- Livros ----------");
        for(Livro l: AcervoLivros){
            lista.append(l).append("\n");
        }
        return lista.toString();
    }

    static public String pesquisar(String genero) {
        StringBuilder lista = new StringBuilder(" ");
        int qtde = 0;
        for(Livro l: AcervoLivros) {
            if(l.getGenero().equalsIgnoreCase(genero)) {
                qtde++;
                lista.append(l.getTitulo()).append("\n");
            }
        }
        lista.append("\n E o total de livros achados no gênero é igual a ").append(qtde);
        return lista.toString();
    }


    static public String pesquisar(double precoInicial, double precoFinal) {
        int total = 0;
        StringBuilder lista = new StringBuilder(" ");
        for(Livro l: AcervoLivros) {
            if (l.getPreco() >= precoFinal && l.getPreco() <= precoFinal) {
                total++;
                lista.append(l.getTitulo()).append("\n");
            }
        }
        lista.append("\n E o total de livros achados na faixa de preço é igual a ").append(total);
        return lista.toString();
    }

    static public boolean remover(String titulo) {
        for (Livro l: AcervoLivros) {
            if(l.getTitulo().equalsIgnoreCase(titulo)) {
                AcervoLivros.remove(l);
                return true;
            }
        }
        return false;
    }

    static public double precoTotalAcervo() {
        double total = 0;
        for(Livro l: AcervoLivros) {
            total += l.getPreco();
        }
        return total;
    }

}
