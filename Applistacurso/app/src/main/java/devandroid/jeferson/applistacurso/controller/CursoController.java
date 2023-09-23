package devandroid.jeferson.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.jeferson.applistacurso.model.Curso;

public class CursoController {

    private List listCursos; //Protege o atributo listCursos
    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso("Java"));
        listCursos.add(new Curso("HTML"));
        listCursos.add(new Curso("C#"));
        listCursos.add(new Curso("Andorind"));
        listCursos.add(new Curso("Python"));

        return  listCursos;
    }

    public ArrayList<String> dadosparaSpinner(){ // Cria Array para gerar uma coleçao de dados

        ArrayList<String> dados = new ArrayList<>();         //Dados para popular o Array

        for (int i = 0; i < getListaDeCursos().size(); i++) {// Ler a lista de cursos com estrutura de repetiçãa. .size para lista ser dinamica

        Curso objeto = (Curso) getListaDeCursos().get(i); // Cria o objeto Curso i= Elemento do laço e inforar o objeto da onde ele esta (Curso)
        dados.add(objeto.getNomeDoCursoDesejado()); // Adiciona o nome do Curso na lista
            
        }

        return dados;


    }

}
