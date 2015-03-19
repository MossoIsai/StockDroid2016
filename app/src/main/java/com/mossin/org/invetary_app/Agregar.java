package com.mossin.org.invetary_app;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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
  private View vista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
/* TabHost
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        System.out.println("Regresa: " +actionBar);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
 */
        //Meu Despegable
        MisMetodosDrawerLayout  misMetodosDrawer =  new MisMetodosDrawerLayout();
        misMetodosDrawer.incializar(drawerLayout,listView,vista,navIconos,titulo,
                R.id.drawer_layout,R.id.lista,R.layout.header,
                R.array.iconos,R.array.opciones_menu);
        listView.setOnItemClickListener(this);

        misMetodosDrawer.llenarMenu();
        /*
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        listView = (ListView)findViewById(R.id.lista);
        View header = getLayoutInflater().inflate(R.layout.header,null);
        listView.addHeaderView(header);
        navIconos = getResources().obtainTypedArray(R.array.iconos);
        titulo = getResources().getStringArray(R.array.opciones_menu);

        navItems = new ArrayList<ItmObject>();
            for(int i = 0; i <titulo.length;i++){
             navItems.add(new ItmObject(titulo[i], navIconos.getResourceId(i, -1)));
          }

            navItems.add(new ItmObject(titulo[1], navIconos.getResourceId(1, -1)));
            navItems.add(new ItmObject(titulo[2], navIconos.getResourceId(2, -1)));
            navItems.add(new ItmObject(titulo[3], navIconos.getResourceId(3, -1)));
            navItems.add(new ItmObject(titulo[4], navIconos.getResourceId(4, -1)));
            navItems.add(new ItmObject(titulo[5], navIconos.getResourceId(5, -1)));
            navItems.add(new ItmObject(titulo[6], navIconos.getResourceId(6, -1)));

        navigationAdapter = new NavigationAdapter(this,navItems);
        listView.setAdapter(navigationAdapter);*/

    }

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
                    selecionada  = true;

                    break;
                case 2:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);
                    selecionada  = true;
                    break;
                case 3:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);
                    selecionada  = true;
                    break;
                case 4:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);
                    selecionada  = true;
                    break;
                case 5:
                    intent = new Intent(Agregar.this, MainActivity.class);
                    startActivity(intent);
                    selecionada  = true;
                    break;

            }


    }
}
