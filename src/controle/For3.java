package controle;

public class For3 {

    public static void main(String[] args) {

        int i = 0;
        for(; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Saiu do for...");
        System.out.println(i);
        // para utilizar a variavel i fora do laço é preciso iniciar ela fora do bloco


        for(int j = 0; j < 10; j++) {
            System.out.println(j);
        }
        int j = 0;
        System.out.println("Saiu do for...");
        System.out.println(j);

        for(int c = 0; c < 10; c++){
            for (int d = 0 ; d < 10; d++){
                System.out.printf("[%d %d]", c, d);
            }
            System.out.println();
        }
    }
}
