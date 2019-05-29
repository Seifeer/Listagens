package com.example.listagens;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AnunciosAdapter extends RecyclerView.Adapter<AnunciosAdapter.AnuncioViewHolder> {
    private Context context;
    private List<Anuncio> anuncios;

    public AnunciosAdapter(Context context, List<Anuncio> anuncios) {
        this.context = context;
        this.anuncios = anuncios;
    }

    @NonNull
    @Override
    public AnuncioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater= new LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_anuncio,viewGroup,false);
        AnuncioViewHolder viewHolder= new AnuncioViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AnuncioViewHolder anuncioViewHolder, int posicao) {
        Anuncio anuncio=anuncios.get(posicao);

        anuncioViewHolder.txtAnuncioTitulo.setText(anuncio.getTitulo());
        anuncioViewHolder.txtAnuncioPreco.setText("R$ "+anuncio.getPreço());
        anuncioViewHolder.txtAnuncioData.setText(anuncio.getData());
    }

    @Override
    public int getItemCount() {
        return anuncios.size();
    }

    class AnuncioViewHolder extends RecyclerView.ViewHolder{
        TextView txtAnuncioTitulo;
        TextView txtAnuncioDescricao;
        TextView txtAnuncioPreco;
        TextView txtAnuncioData;
        TextView txtAnuncioBairro;

        public AnuncioViewHolder(@NonNull View itemView){
            super(itemView);

            //Binding
            txtAnuncioTitulo=itemView.findViewById(R.id.txt_titulo);
            txtAnuncioPreco=itemView.findViewById(R.id.txt_preco);
            txtAnuncioData=itemView.findViewById(R.id.txt_data);
        }
    }
}
