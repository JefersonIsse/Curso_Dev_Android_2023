package devandroid.jeferson.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import devandroid.jeferson.applistacurso.R;
import devandroid.jeferson.applistacurso.database.ListaVipDB;

public class SplashActivity extends AppCompatActivity {


    public static final int TIME_OUT_SPLASH =3000; // Tempo que a tela SPLASH

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ListaVipDB db = new ListaVipDB(SplashActivity.this);


        cumutarTelaSplash(); // Criou o metodo

    }

    private void cumutarTelaSplash() {   // Oque faz o metodo cumutarTelaSplash

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent telaPrincipal = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(telaPrincipal);
                finish();

            }
        },TIME_OUT_SPLASH);

    }
}