package controle;

public class Continue {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i % 2 == 1) {
                continue; // pula os ímpares e imprime só os pares
            }
            System.out.println(i);
        }
        for (int i = 1; i < 10; i++) {

            if (i  == 5) continue; // pula o numero 5
            System.out.println(i);
            }
        }
    }

