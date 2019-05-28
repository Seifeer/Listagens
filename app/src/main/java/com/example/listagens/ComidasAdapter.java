package com.example.listagens;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ComidasAdapter extends RecyclerView.Adapter<ComidasAdapter.ComidaViewHolder> {
    private Context context;
    private List<Comida> comidas;

    public ComidasAdapter(Context context, List<Comida> comidas) {
        this.context = context;
        this.comidas = comidas;
    }

    @NonNull
    @Override
    public ComidaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = new LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.item_comida,viewGroup,false);

        ComidaViewHolder viewHolder=new ComidaViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ComidaViewHolder comidaViewHolder, int posicao) {
        Comida comida=comidas.get(posicao);

        comidaViewHolder.TxtComidaNome.setText(comida.getNome());
        comidaViewHolder.TxtComidaIngredientes.setText(comida.getIngredientes());
        //String valor = String.format("R$ %.2f",)
        comidaViewHolder.TxtComidaValor.setText("R$ "+comida.getValor());
    }

    @Override
    public int getItemCount() {
        return comidas.size();
    }

    class ComidaViewHolder extends RecyclerView.ViewHolder{

        TextView TxtComidaNome;
        TextView TxtComidaIngredientes;
        TextView TxtComidaValor;

        public ComidaViewHolder(@NonNull View itemView) {
            super(itemView);

            //Binding
            TxtComidaNome=itemView.findViewById(R.id.txt_comida_nome);
            TxtComidaIngredientes=itemView.findViewById(R.id.txt_xomida_ingredientes);
            TxtComidaValor=itemView.findViewById(R.id.txt_comida_valor);

            // Configurar cliks
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public  void onClick (View v){
                    int posicao=getAdapterPosition();
                    Toast.make(v, "Clicou.", Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
