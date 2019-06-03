package com.example.listagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class AnunciosActivity extends AppCompatActivity {

    private RecyclerView rvAnuncios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios);

        rvAnuncios=findViewById(R.id.rv_anuncios);
        atualizarViews();
    }

    private void atualizarViews() {
        AnunciosAdapter adapter=new AnunciosAdapter(this, Anuncio.getAnuncios());

        rvAnuncios.setAdapter(adapter);
        rvAnuncios.setLayoutManager(new LinearLayoutManager(this));
    }
}
