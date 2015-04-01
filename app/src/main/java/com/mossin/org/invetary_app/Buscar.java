package com.mossin.org.invetary_app;

import android.app.SearchManager;
import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


public class Buscar extends ActionBarActivity {
    private ListView listView;
    private ArrayAdapter<String> adaptador;
    private  String arregloElementos[]  =
            {"MOSO","ISAI","GARCIA","PANDITA","PANDA","RAUL","TOÑO","TOÑO3"
                    ,"GEORGE","DUMN","CAPUFE","CAPUDE2",
                    "MEXICO","EUG","NACI","PEDRO","TRES","CIENTOS","TRECIENTOS","DOSMIL"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);
        //Here We Go! Mosso
        listView = (ListView)findViewById(R.id.listVista);
        //adaptador = new ArrayAdapter<>(this,android.R.layout.two_line_list_item,arregloElementos);
        adaptador = new TituloAdapter(this,FuenteDatos.TAREAS);
        listView.setAdapter(adaptador);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buscar, menu);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager =(SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        return true;
    }


}
