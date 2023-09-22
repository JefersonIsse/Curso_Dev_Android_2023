package devandroid.jeferson.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.jeferson.applistacurso.model.Pessoa;
import devandroid.jeferson.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listavip;
    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity){

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES,0);
        listavip = preferences.edit();



    }


    @NonNull
    @Override
    public String toString() {

        Log.d("MVC_Controller", "Controller Iniciada...");

        return super.toString();
    }
    public void criarSharedPreferences(){


    }
    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller", "Salvo: "+pessoa.toString());
        listavip.putString("primeiroNome",pessoa.getPrimeiroNome());
        listavip.putString("sobreNome",pessoa.getSobreNome());
        listavip.putString("nomeCurso",pessoa.getCursoDesejado());
        listavip.putString("Contato",pessoa.getTelContato());
        listavip.apply();

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
