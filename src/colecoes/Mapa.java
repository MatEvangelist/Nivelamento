package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(3, "Ricardo");
        usuarios.put(20, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet()); // coluna das chaves
        System.out.println(usuarios.values()); // valores
        System.out.println(usuarios.entrySet()); // chave e valor

        System.out.println(usuarios.containsKey(20)); // return false/true
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));

        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for(String valor: usuarios.values()) {
            System.out.println(valor);
        }

        for(Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " -> ");
            System.out.println(registro.getValue());

        }

    }

}
