package classe;

public class Data {

    int dia;
    String mes;
    int ano;

    Data () { // construtor padrão que seta valores que valerão para qualquer objeto quase eles
        // não sejam especificados
        //dia = 1;
        //mes = "Janeiro";
        //ano = 1970;
        this(1,"Janeiro",1970);
    }

    Data (int dia, String mes, int ano) {
        //dia = diaInicial;
        //mes = mesInicial;
        //ano = anoInicial;
        this.dia = dia; // referenciar o objeto sendo criado
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada () {
        String Formato = "Dia %d de %s de %d"; // Variável local só existe dentro do método.
        return String.format(Formato, this.dia, mes, ano);
    }


//    void imprimirDataFormatada () {
//        System.out.printf("\nDia %d de %s de %d", dia, mes, ano);
//    }

    void imprimirDataFormatada () {
        System.out.printf(this.obterDataFormatada());
    }

}
