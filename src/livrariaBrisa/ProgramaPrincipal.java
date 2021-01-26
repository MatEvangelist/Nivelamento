package livrariaBrisa;

import java.util.Scanner;

public class ProgramaPrincipal {

    static void exibirMenu() {
        System.out.println("----------MENU LIVRARIA----------");
        System.out.println("1 -> CADASTRAR");
        System.out.println("2 -> LISTAR");
        System.out.println("3 -> EXCLUIR LIVRO");
        System.out.println("4 -> PESQUISAR POR GENERO");
        System.out.println("5 -> PESQUISAR PELA FAIXA DE PREÇO");
        System.out.println("6 -> CALCULAR PREÇO TOTAL DO ACERVO");
        System.out.println("7 -> SAIR");
        System.out.println(" ");
        System.out.println("--------ESCOLHA UMA OPÇÃO--------");
    }

    public static void main(String[] args) {

        Scanner entradaNumerica = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        Livro objeto;
        double vInicial, vFinal, preco;

        String titulo, autor, genero;


        do {
            exibirMenu();
            menu = entradaNumerica.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Digite o título: ");
                    titulo = entradaString.nextLine();

                    System.out.println("Digite o nome do autor: ");
                    autor = entradaString.nextLine();

                    System.out.println("Digite o gênero: ");
                    genero = entradaString.nextLine();

                    System.out.println("Digite o preço: ");
                    preco = entradaNumerica.nextDouble();

                    objeto = new Livro(titulo, autor, genero, preco);
                    Acervo.adicionarLista(objeto);
                    break;

                case 2:
                    System.out.println("-------LISTAGEM DOS LIVROS-------");
                    System.out.println(Acervo.listar());
                    break;

                case 3:
                    System.out.println("-------------REMOÇÃO-------------");
                    System.out.println("Qual livro deseja remover: ");
                    titulo = entradaString.nextLine();
                    if (!Acervo.listar().isEmpty()){
                        Acervo.remover(titulo);
                        System.out.println("Livro foi removido.");
                    } else {
                        System.out.println("Acervo está vazio.");
                    }
                    break;

                case 4:
                    System.out.println("-------PESQUISA POR GÊNERO-------");
                    System.out.println("Qual o gênero da pesquisa:");
                    genero = entradaString.nextLine();
                    System.out.println(Acervo.pesquisar(genero));
                    break;

                case 5:
                    System.out.println("-------PESQUISA PELO PREÇO-------");
                    System.out.println("Qual o valor inicial da pesquisa: ");
                    vInicial = entradaNumerica.nextDouble();
                    System.out.println("Qual o valor final da pesquisa: ");
                    vFinal = entradaNumerica.nextDouble();
                    System.out.println(Acervo.pesquisar(vInicial, vFinal));
                    break;

                case 6:
                    System.out.println("------PREÇO TOTAL DO ACERVO------");
                    System.out.println("O preço total do acervo é R$" +
                            String.format("%.2f", Acervo.precoTotalAcervo()));
                    break;

                case 7:
                    System.out.println("Tchau, tchau. Volte sempre!!! :D");
                    break;

                default:
                    System.out.println("Opção inválida... ");

            }
        } while (menu != 7);
    }
}
