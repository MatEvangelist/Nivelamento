package classe;

public class AreaCirc {

    double raio;
    static final double PI = 3.14;
    // static serve pra definir variável de classe
    // final define constante

    AreaCirc (double raioInicial) { // construtor
        raio = raioInicial;
    }

    double area () { // método
        return Math.pow(raio, 2) * PI;
    }

    static double area (double raio) {
        return PI * Math.pow(raio,2);
    } // método estático

}
