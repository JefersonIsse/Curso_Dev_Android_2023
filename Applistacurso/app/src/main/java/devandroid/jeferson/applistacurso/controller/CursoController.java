package devandroid.jeferson.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.jeferson.applistacurso.model.Curso;

public class CursoController {

    public List listCursos;
    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso>();

        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
        listCursos.add(new Curso());
    }

}
