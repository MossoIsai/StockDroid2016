package com.mossin.org.invetary_app;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ListView;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by mossin on 18/03/15.
 */
public class MisMetodosDrawerLayout extends ActionBarActivity{

   private DrawerLayout drawerLayout;
   private ListView listView;
   private View header;
   private TypedArray navicons;
   private String[] titulo;
   private ArrayList<ItmObject> navItems;
   private NavigationAdapter navigationAdapter;
/*
   public MisMetodosDrawerLayout(DrawerLayout drawerLayout,ListView listView, View vista, TypedArray navicons,String[] titulo){
      this.drawerLayout = drawerLayout;
      this.listView = listView;
      this.header = vista;
      this.navicons = navicons;
      this.titulo = titulo;
   }*/

   public void incializar( DrawerLayout menu, ListView listView, View vista, TypedArray navicons,String[]titulos, int drawer,int lista,int layouheader,int iconos, int opciones_menu){
        menu = this.drawerLayout;
        listView = this.listView;
        vista = this.header;
        navicons = this.navicons;
        titulos = this.titulo;
        menu  = (DrawerLayout)findViewById(drawer);
        listView = (ListView)findViewById(lista);
        vista = getLayoutInflater().inflate(layouheader,null);
        listView.addHeaderView(vista);
        navicons = getResources().obtainTypedArray(iconos);
        titulos = getResources().getStringArray(opciones_menu);
   }
   public void llenarMenu(){
       navItems = new ArrayList<ItmObject>();
       for (int i = 0; i<= titulo.length; i++) {
           navItems.add(new ItmObject(titulo[i], navicons.getResourceId(i, -1)));
       }
       navigationAdapter = new NavigationAdapter(this,navItems);
       listView.setAdapter(navigationAdapter);
   }



}
