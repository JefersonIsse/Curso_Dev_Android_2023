package devandroid.jeferson.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.jeferson.applistacurso.R;
import devandroid.jeferson.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outrapessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteudo, dados, valores para Objeto
        // Conforme o seu MODELO, TEMPLATE

        pessoa.setPrimeiroNome("Jeferson");
        pessoa.setSobreNome("Isse");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelContato("51-999914688");

       outrapessoa = new Pessoa();
       outrapessoa.setPrimeiroNome("Lucas");
       outrapessoa.setSobreNome("Davi");
       outrapessoa.setCursoDesejado("Fisica");
       outrapessoa.setTelContato("51-981756793");


        int parada =0;

    }
}