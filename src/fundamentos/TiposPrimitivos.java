package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        int i = 5; // i recebe uma cópia do valor 5
        int j = i; // j recebe uma cópia do valor de i
        i = i + 1; // i vira 6, j continua 5


        // Informações do Funcionário

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = '\u0010'; // ativo // tabela unicode de símbolos
        char random1 = 'A';
        char random2 = '1';
        char random3 = '?';

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        //Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
