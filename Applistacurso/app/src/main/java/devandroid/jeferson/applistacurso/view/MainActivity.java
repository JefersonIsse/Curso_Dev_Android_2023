package devandroid.jeferson.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.jeferson.applistacurso.R;
import devandroid.jeferson.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;
    EditText editprimeironome;
    EditText editsobrenome;
    EditText editnomecurso;
    EditText editTel;
    Button btnlimpar;
    Button btnsalvar;
    Button btnfinalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        // Atribuir conteudo, dados, valores para Objeto
        // Conforme o seu MODELO, TEMPLATE

        /*
        pessoa.setPrimeiroNome("Jeferson");
        pessoa.setSobreNome("Isse");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelContato("51-999914688");
        */

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Lucas");
        outraPessoa.setSobreNome("Davi");
        outraPessoa.setCursoDesejado("Fisica");
        outraPessoa.setTelContato("51-981756793");

        editprimeironome = findViewById(R.id.editprimeironome);
        editsobrenome = findViewById(R.id.editsobrenome);
        editnomecurso = findViewById(R.id.editnomecurso);
        editTel = findViewById(R.id.editTel);

        btnlimpar = findViewById(R.id.btnlimpar);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnfinalizar = findViewById(R.id.btnfinalizar);

        editprimeironome.setText(pessoa.getPrimeiroNome());
        editsobrenome.setText(pessoa.getSobreNome());
        editnomecurso.setText(pessoa.getCursoDesejado());
        editTel.setText(pessoa.getTelContato());

        // Inserindo Função para os Botões
        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editprimeironome.setText("");
                editsobrenome.setText("");
                editnomecurso.setText("");
                editTel.setText("");

            }
        });

        // Botçao finalizar (fecha o App)
        btnfinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();

            }
        });

        // Botão Salvar - Salva uma novo Objeto Pessoa
        btnsalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pessoa.setPrimeiroNome(editprimeironome.getText().toString());
                pessoa.setSobreNome(editsobrenome.getText().toString());
                pessoa.setCursoDesejado(editnomecurso.getText().toString());
                pessoa.setTelContato(editTel.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo" + pessoa.toString(), Toast.LENGTH_LONG).show();


            }
        });
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

        Log.i("POOAndroid", "Objeto pessoa: " + pessoa.toString());
        Log.i("POOAndroid", "Objeto outraPessoa: " + outraPessoa.toString());
    }
}