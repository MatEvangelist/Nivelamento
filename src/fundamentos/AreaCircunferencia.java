package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double raio = 3; //double é float
        final double PI = 3.14159; //final impede que o valor seja mudado

        double area = PI * raio * raio;
        System.out.println(area);
        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area + "m²");
    }
}
