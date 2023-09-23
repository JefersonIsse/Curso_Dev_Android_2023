package devandroid.jeferson.applistacurso.model;

public class Curso {

    private String nomeDoCursoDesejado;

    public Curso(String nomeDoCursoDesejado) {  //Construtor Criado que recebe o nome do Curso
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }

    public String getNomeDoCursoDesejado() {
        return nomeDoCursoDesejado;
    }

    public void setNomeDoCursoDesejado(String nomeDoCursoDesejado) {
        this.nomeDoCursoDesejado = nomeDoCursoDesejado;
    }
}
