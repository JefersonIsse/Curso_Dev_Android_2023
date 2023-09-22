package devandroid.jeferson.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.jeferson.applistacurso.R;
import devandroid.jeferson.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;
    String dadosOutraPessoa;


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

       outraPessoa = new Pessoa();
       outraPessoa.setPrimeiroNome("Lucas");
       outraPessoa.setSobreNome("Davi");
       outraPessoa.setCursoDesejado("Fisica");
       outraPessoa.setTelContato("51-981756793");
/*

       dadosPessoa = "Primeiro nome: ";
       dadosPessoa += pessoa.getPrimeiroNome();
       dadosPessoa += " Sobrenome: ";
       dadosPessoa += pessoa.getSobreNome();
       dadosPessoa += " Curso Desejado: ";
       dadosPessoa += pessoa.getCursoDesejado();
       dadosPessoa += " Telefone: ";
       dadosPessoa += pessoa.getTelContato();

       dadosOutraPessoa = "Primeiro nome: ";
       dadosOutraPessoa += outraPessoa.getPrimeiroNome();
       dadosOutraPessoa += " Sobrenome: ";
       dadosOutraPessoa += outraPessoa.getSobreNome();
       dadosOutraPessoa += " Curso Desejado: ";
       dadosOutraPessoa += outraPessoa.getCursoDesejado();
       dadosOutraPessoa += " Telefone: ";
       dadosOutraPessoa += outraPessoa.getTelContato();
*/

       // To String substitui os comandos acima de "dados pessoa"

       Log.i("POOAndroid","Objeto pessoa: "+pessoa.toString());
       Log.i("POOAndroid","Objeto outraPessoa: "+outraPessoa.toString());
    }
}