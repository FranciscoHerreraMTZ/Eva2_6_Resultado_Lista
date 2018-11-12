package com.example.spart.eva2_6_resultado_lista;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.widget.ListViewAutoScrollHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaRestaurantes extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView listaRes;
    Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        listaRes = findViewById(R.id.listaRes);
        listaRes.setOnItemClickListener(this);
        listaRes.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Datos.sResta));
        inDatos = getIntent();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        inDatos.putExtra("Restaurante",i);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }
}
