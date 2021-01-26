package aula07e08;

public class Lutador implements Controlador {
    // Atributos //
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //------------------------------------------//

    public Lutador(String nome, String nacionalidade,
                   int idade, float altura, double pe, int vitorias,
                   int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(pe);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    //------------------------------------------//


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //------------------------------------------//

    public void apresentar() {
        System.out.println("------------------------------------------");
        System.out.println("Apresentando no ringue o lutador " + this.getNome());
        System.out.println("Vindo diretamente do(a) " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getPeso() + " Kg");
        System.out.printf("Com %.2f metros de altura\n", this.getAltura());
        System.out.println("Com um total de " + this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates");

    }

    public void status() {
        System.out.println("------------------------------------------");
        System.out.println(this.getNome() + " da categoria " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes,");
        System.out.println("perdeu " + this.getDerrotas() + " vezes e ");
        System.out.println("empatou " + this.getEmpates() + " vezes");

    }


    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }


    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }


    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
