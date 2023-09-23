package devandroid.jeferson.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import devandroid.jeferson.applistacurso.R;
import devandroid.jeferson.applistacurso.controller.CursoController;
import devandroid.jeferson.applistacurso.controller.PessoaController;
import devandroid.jeferson.applistacurso.model.Curso;
import devandroid.jeferson.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {


    PessoaController controller;
    CursoController cursoController; // Instanciar a Controladora Curso

    Pessoa pessoa;
    List<Curso> listaDeCursos; // Criar uma Lista que recebe o objet tipo <Curso>
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


        controller = new PessoaController(MainActivity.this);
        controller.toString();

        cursoController = new CursoController(); // Cria o Objeto da controladora
        listaDeCursos = cursoController.getListaDeCursos(); // Chama o metodo getListaDeCursos e retribui o valor dele para listaDeCursos

        // popular o objeto

       pessoa = new Pessoa();
       controller.buscar(pessoa);


         // Inserir dados do Objeto no EditText


        editprimeironome = findViewById(R.id.editprimeironome);
        editsobrenome = findViewById(R.id.editsobrenome);
        editnomecurso = findViewById(R.id.editnomecurso);
        editTel = findViewById(R.id.editTel);

        editprimeironome.setText(pessoa.getPrimeiroNome());
        editsobrenome.setText(pessoa.getSobreNome());
        editnomecurso.setText(pessoa.getCursoDesejado());
        editTel.setText(pessoa.getTelContato());


        btnlimpar = findViewById(R.id.btnlimpar);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnfinalizar = findViewById(R.id.btnfinalizar);

        // Inserindo Função para os Botões
        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editprimeironome.setText("");
                editsobrenome.setText("");
                editnomecurso.setText("");
                editTel.setText("");
                controller.limpar();

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



        // Metodo Salvar utilizando a controller

            controller.salvar(pessoa);



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
    }
}