package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final double fatorc = 5.0/9;
        final int fatorf = 32;

        double tempfaren = 86 - 32;
        double temperaturac = tempfaren * fatorc;
        System.out.println("O resultado é " + temperaturac + "°C.");

    }
}

