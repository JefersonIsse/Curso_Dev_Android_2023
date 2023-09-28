package devandroid.jeferson.applistacurso.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import devandroid.jeferson.applistacurso.model.Pessoa;

public class ListaVipDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "listavip.db"; // Nome BD
    private static final int DB_VERSION = 1; // Versao do SQL

    Cursor cursor; // Criando Objeto
    SQLiteDatabase db;

    public ListaVipDB (Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Query SQL para Criar uma tabela

        String sqlTabelaPessoa
                = "CREATE TABLE Pessoa (id INTEGER PRIMARY KEY AUTOINCREMENT, " + // Criando a tabela e informando a PK vai ser incremental
                "primeiroNome TEXT, " +
                "sobreNome TEXT, " +
                "cursoDesejado TEXT, " +
                "TelContato TEXT)";

        db.execSQL(sqlTabelaPessoa);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void  salvarObjeto(String tabela, ContentValues dados){

        db.insert(tabela,null,dados);


    }

    public List<Pessoa> listarDados(){

        List<Pessoa> lista = new ArrayList<>();

        // Representa um registro q esta salvo na tabela
        Pessoa registro;
        String querySQL = "SELECT * FROM Pessoa";
        cursor = db.rawQuery(querySQL,null);

        if (cursor.moveToFirst()){

            do{

                registro = new Pessoa();
                registro.setId(cursor.getInt(0));
                registro.setPrimeiroNome(cursor.getString(1));
                registro.setSobreNome(cursor.getString(2));
                registro.setCursoDesejado(cursor.getString(3));
                registro.setTelContato(cursor.getString(3));

                lista.add(registro);

            }while (cursor.moveToNext());


        }else {


        }

        return lista;

    }

    // Criar metodos para implementar um CRUD (Create,Retrieve, Update , Delete)

    public void alterarObjeto(String tabela, ContentValues dados){

        // ID do registro a ser alterado (PK)
        // update TABLE set campo=novoDado WHERE id=?

        int id = dados.getAsInteger("id");

        db.update(tabela,dados,"id=?",
            new String[]{Integer.toString(id)});

    }

    public void deletarObjeto(String tabela, int id){

        // ID do registro a ser alterado (PK)
        // Delete TABLE set campo=novoDado WHERE id=?

        db.delete(tabela,"id=?",
                new String[]{Integer.toString(id)});

    }
}
