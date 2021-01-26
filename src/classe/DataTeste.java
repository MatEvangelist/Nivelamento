package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data d1 = new Data(20, "Fevereiro", 1999);
        // Objeto com dados setados no Main

        Data d2 = new Data(); //Mesma coisa que o de cima, só que feito de uma forma diferente
        d2.dia = 04;
        d2.mes = "Abril";
        d2.ano = 1971;

        Data d3 = new Data(); // Objeto com dados setados do construtor default

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
        d3.imprimirDataFormatada();

        String dataFormatada1 = d1.obterDataFormatada();
        System.out.println(dataFormatada1);

    }

}
