package classe;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;


    public boolean equals(Object objeto) {

        if(objeto instanceof Usuario) {
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            // boolen nomeIgual = outro.nome == this.nome;

            boolean emailIgual = outro.email.equals(this.email);
            // boolean emailIgual = outros.email == this.email;

            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return 0;
    }
}

