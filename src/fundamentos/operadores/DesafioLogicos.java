package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean tt = true;
        boolean tq = true;

        boolean televisao50 = tt && tq;
        boolean televisao32 = tt ^ tq;
        boolean sorvete = tt || tq;
        boolean maisSaudavel = !sorvete;

        System.out.println("Comprou a de 50? " + televisao50);
        System.out.println("Comprou a de 32? " + televisao32);
        System.out.println("Comprou sorvete? " + sorvete);
        System.out.println("Ficou mais saudável? " + maisSaudavel);


    }
}
