package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

    private Validar() {
    }

    public static void aluno(Aluno aluno) {

        // exceção do java
        if(aluno == null) {
            throw new IllegalArgumentException("O aluno está nulo!");
        }

        // exceções minhas
        if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
            throw new StringVaziaException("nome");
        } //.trim() tira os espaços em branco

        if (aluno.nota < 0 || aluno.nota > 10) {
            throw new NumeroForaIntervaloException("nota");
        }
    }
}
