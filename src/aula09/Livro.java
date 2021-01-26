package aula09;

import java.util.Random;

public class Livro implements  Publicacao {

    // -----------------

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // -----------------


    public Livro(String titulo, String autor, int totPaginas,
                 Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    // -----------------


    public String detalhes() {
        return "Livro ->" +
                "\n, título: " + titulo  +
                "\n, autor: " + autor +
                "\n, totPaginas: " + totPaginas +
                "\n, pagAtual: " + pagAtual +
                "\n, aberto: " + aberto +
                "\n, leitor: " + leitor.getNome() +
                "\n, idade do leitor: " + leitor.getIdade() +
                "\n, sexo: " + leitor.getSexo() +
                ' ';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // -----------------

    @Override
    public void abrir() {
        if(this.isAberto()) {
            System.out.println("O livro já está aberto.");
        } else {
            this.aberto = true;
            System.out.println("O livro foi aberto.");
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()) {
            this.aberto = false;
            System.out.println("O livro foi fechado.");
        } else {
            System.out.println("O livro já está fechado.");
        }
    }

    @Override
    public void folhear(int pag) {
        if(pag > this.totPaginas) {
            this.pagAtual = 0;
            System.out.println("Essa página não existe.");
        } else {
            this.pagAtual = pag;
        }
    }


    @Override
    public void folhearAleatorio() {
        Random aleatorio = new Random();
        int pagina = aleatorio.nextInt(getTotPaginas());
        this.setPagAtual(pagina);
        System.out.println("Após folhear, a página de parada foi a "
                + this.getPagAtual());
    }

    @Override
    public void avancarPag() {
        if (this.pagAtual < this.totPaginas) {
            this.pagAtual++;
            System.out.println("Avançando uma página, a página atual é: "
                    + this.getPagAtual());
        } else {
            System.out.println("Última página alcançada.");
        }
    }

    @Override
    public void voltarPag() {
        if (this.pagAtual > 1) {
            this.pagAtual--;
            System.out.println("Recuando uma página, a página atual é: "
                    + this.getPagAtual());
        } else {
            System.out.println("Não há o que voltar antes da primeira página.");
        }
    }
}
