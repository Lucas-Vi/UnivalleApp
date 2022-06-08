package com.example.univalleapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //ANIMACIONES
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.desplazamineto_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView texcientifica = findViewById(R.id.texcientifica);
        TextView texrespuesta = findViewById(R.id.texrespuesta);
        TextView texfuturo = findViewById(R.id.textfuturo);
        ImageView logoUni = findViewById(R.id.logo_imageview);

        texcientifica.setAnimation(animation2);
        texrespuesta.setAnimation(animation2);
        texfuturo.setAnimation(animation2);
        logoUni.setAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);

    }
}