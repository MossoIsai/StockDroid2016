package com.mossin.org.invetary_app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mossin on 17/03/15.
 */
public class NavigationAdapter extends BaseAdapter{
    private Activity activity;
    ArrayList<ItmObject> arrayItems;

    public NavigationAdapter(Activity activity, ArrayList<ItmObject> arrayItems){
         super();
        this.activity = activity;
        this.arrayItems = arrayItems;
    }
    //Retorna el tamaño total del ItemObj
    @Override
    public int getCount() {
        return  arrayItems.size();
    }
    //Retorna objeto ItemObject del ArrayList Seleccionado
    @Override
    public Object getItem(int position) {
       return arrayItems.get(position);
    }
  //Retorna el id de la Posicion
    @Override
    public long getItemId(int position) {
        return position;
    }
    //Clase que represeta la Fila
    public static class Fila{
      TextView titutlo_item;
        ImageView icono;
    }

    @Override
    public View getView(int posicion, View convertView, ViewGroup viewGroup) {
        Fila view;
        LayoutInflater inflator = activity.getLayoutInflater();
        if(convertView == null){
            view =  new Fila();
            //Creo objeto Item y lo de  objeto array
            ItmObject item = arrayItems.get(posicion);
            convertView = inflator.inflate(R.layout.itm,null);
            //Titulo
            view.titutlo_item = (TextView)convertView.findViewById(R.id.tittle_item);
            //Seteo el campo titulo el nombre correspodiente del object
            view.titutlo_item.setText(item.getTitulo());
            //Icono
            view.icono = (ImageView)convertView.findViewById(R.id.icon);
            //Seteo del icon
            view.icono.setImageResource(item.getIcono());
            convertView.setTag(view);
        }else{
            view = (Fila)convertView.getTag();
        }
        return convertView;
    }
}
