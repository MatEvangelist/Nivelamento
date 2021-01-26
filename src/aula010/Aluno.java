package aula010;

public class Aluno extends Pessoa {

    private String curso;
    private int matri;

    public void cancelarMatri() {
        System.out.println("Matrícula cancelada.");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatri() {
        return matri;
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }
}
