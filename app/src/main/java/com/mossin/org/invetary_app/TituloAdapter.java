package com.mossin.org.invetary_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TituloAdapter<T> extends ArrayAdapter<T> {


    public TituloAdapter(Context context, List<T> objects) {
        super(context, 0, objects);
    }


/*
    @Override
    public int getCount() {
        return 0;
        /*
        Retorna en la cantidad de elementos que tiene un adaptador.
        Con este valor la lista ya puede establecer un limite para añadir filas.
         */
    //}
   /*
    @Override
    public long getItemId(int posicion) {
        return posicion;
        /*
        Obtiene un elemento de la fuente de datos asignada al adaptador en una posición establecida.
         Normalmente la fuente de datos es un arreglo o lista de objetos
         */
    //}

    @Override
    public View getView(int posicion, View convertview, ViewGroup viewGroup) {
        /*
        *  Retorna en el View elaborado e
        *  inflado de un elemento en una posición especifica.
        * */

         //Obteniendo una instancia  del inflanter
        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Salvando la referencia del View de la Fila
        View listItemView = convertview;
        ///Comprobando si el View no existe
        if (convertview == null) {
            //Si no existe, entonces inflarlo con two_line_list_item.xml
            listItemView = inflater.inflate(
              R.layout.titulos,
               viewGroup, false);
        }
            //Obteniendo instancias desde los textview
            TextView titulo = (TextView) listItemView.findViewById(R.id.name);
            TextView subtitulo = (TextView) listItemView.findViewById(R.id.description);
            TextView fecha = (TextView)listItemView.findViewById(R.id.date);
            //Obteniendo instancias de la Tarea en la posicion actual
            //T item = (T) getItem(posicion);
            //Dividir la cadena en nombre y hora
        //Obteniendo instancia de la Tarea en la posición actual
        Titulo item = (Titulo) getItem(posicion);

        titulo.setText(item.getNombre());
        subtitulo.setText(item.getSubtitle());
        // IMAGENfecha.setImageResource(item.getCategoria());
        fecha.setText(item.getFecha());
        //Devolder al listView la fila creaada
            return listItemView;
        }
    }


