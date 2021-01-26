package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a = new AreaCirc(10);
        a.raio = 10;
        // a.pi = 10;
        System.out.println(a.area());

        AreaCirc b = new AreaCirc(5);
        b.raio = 100;
        // b.pi = 5;
        System.out.println(b.area());
        System.out.println(AreaCirc.area(100)); // método estático,
        // pode ser chamado pela classe e não pela instância


        // AreaCirc.PI = 0.1;
        // trocar valor de static direto na classe


        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);

        // System = classe, out = atributo estático/da classe, print = método


    }

}


