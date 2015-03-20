package com.mossin.org.invetary_app;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class Agregar extends ActionBarActivity  implements AdapterView.OnItemClickListener{
  private DrawerLayout drawerLayout;
  private NavigationAdapter navigationAdapter;
  private TypedArray navIconos;
  private ListView listView;
  private ArrayList<ItmObject> navItems;
  private String[] titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
 /*
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        System.out.println("Regresa: " +actionBar);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 */
        //Meu Despegable
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        listView = (ListView)findViewById(R.id.lista);
        listView.setOnItemClickListener(this);
        View header = getLayoutInflater().inflate(R.layout.header,null);
        listView.addHeaderView(header);
        navIconos = getResources().obtainTypedArray(R.array.iconos);
        titulo = getResources().getStringArray(R.array.opciones_menu);

        navItems = new ArrayList<ItmObject>();
            for(int i = 0; i <titulo.length;i++){
             navItems.add(new ItmObject(titulo[i], navIconos.getResourceId(i, -1)));
          }

        navigationAdapter = new NavigationAdapter(this,navItems);
        listView.setAdapter(navigationAdapter);

    }//Fin del Oncreate


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int posicion, long l) {
        Intent intent;
        int color_sombra = R.color.txt;
        boolean selecionada = false;
        view.setBackgroundColor(color_sombra);

            switch (posicion) {
                case 1:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);

                    break;
                case 2:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);

                    break;
                case 3:
                    intent = new Intent(Agregar.this, Buscar.class);
                    startActivity(intent);

                    break;
                case 4:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);

                    break;
                case 5:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);

                    break;
            }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_agregar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        Intent intent;
        if (id == R.id.action_settings) {
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
