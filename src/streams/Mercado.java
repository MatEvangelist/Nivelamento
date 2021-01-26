package streams;

public class Mercado {

    private final int quantidade;
    private final double preco;
    private final String nome;
    private final boolean disponivel;

    public Mercado(int quantidade, double preco, String nome, boolean disponivel) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.nome = nome;
        this.disponivel = disponivel;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
