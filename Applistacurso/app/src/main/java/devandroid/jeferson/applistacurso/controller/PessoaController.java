package devandroid.jeferson.applistacurso.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import java.util.List;

import devandroid.jeferson.applistacurso.database.ListaVipDB;
import devandroid.jeferson.applistacurso.model.Pessoa;
import devandroid.jeferson.applistacurso.view.MainActivity;

public class PessoaController extends ListaVipDB {

    SharedPreferences preferences;
    SharedPreferences.Editor listavip;
    public static final String NOME_PREFERENCES = "pref_listavip";


    public PessoaController(MainActivity mainActivity){
            super(mainActivity);

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES,0);
        listavip = preferences.edit();

    }

    public void salvar(Pessoa pessoa) {

        ContentValues dados = new ContentValues();

        Log.d("MVC_Controller", "Salvo: "+pessoa.toString());
        listavip.putString("primeiroNome",pessoa.getPrimeiroNome());
        listavip.putString("sobreNome",pessoa.getSobreNome());
        listavip.putString("nomeCurso",pessoa.getCursoDesejado());
        listavip.putString("Contato",pessoa.getTelContato());
        listavip.apply();

        dados.put("primeiroNome", pessoa.getPrimeiroNome());
        dados.put("sobreNome", pessoa.getSobreNome());
        dados.put("cursoDesejado", pessoa.getCursoDesejado());
        dados.put("TelContato", pessoa.getTelContato());

        salvarObjeto("Pessoa", dados);

        /*"nomePrimeiroNome TEXT, " +
                "nomeSobrenome TEXT, " +
                "nomeCursoDesejado TEXT, " +
                "telContato REAL, " +; */

    }


    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller Iniciada...");

        return super.toString();
    }
    public void criarSharedPreferences(){


    }


    public List<Pessoa> getListaDados(){
        return listarDados();

    }

    public Pessoa buscar(Pessoa pessoa){

        pessoa.setPrimeiroNome(preferences.getString("primeiroNome",""));
        pessoa.setSobreNome(preferences.getString("sobreNome",""));
        pessoa.setCursoDesejado(preferences.getString("nomeCurso",""));
        pessoa.setTelContato(preferences.getString("Contato",""));

        return pessoa;
    }

    public void limpar(){

        listavip.clear();
        listavip.apply();

    }
}
