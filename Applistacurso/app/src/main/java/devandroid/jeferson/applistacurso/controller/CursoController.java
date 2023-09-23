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

}
