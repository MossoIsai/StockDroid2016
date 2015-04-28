package com.mossin.org.invetary_app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
  private Button entrar;
  private Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //Botones
        entrar = (Button)findViewById(R.id.button);
        salir = (Button)findViewById(R.id.button2);
        entrar.setOnClickListener(this);
        salir.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
      switch (v.getId()){
          case R.id.button:
             //Boton entrar
              Intent intent =  new Intent(this,Agregar.class);
              startActivity(intent);
              finish();
              break;
          case R.id.button2:
              //Boton salir
              finish();
              break;
      }
    }
}
