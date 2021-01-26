package excecao;

public class ChecadaXNChecada {

    public static void main(String[] args) {

        geraErro1();

        geraErro2();

        try {
            geraErro3();
        } catch (Throwable e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("Fim");
    }


    // Exceção Não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }


    //Exceção checada ou verificada
    static void geraErro2()  {
        try {
            throw new Exception("Ocorreu um erro bem legal #02!");
        } catch (Exception e) {
            System.out.println("Que legal!");
        }
    }

    //Exceção checada ou verificada
    static void geraErro3() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #03!");
    }

}
