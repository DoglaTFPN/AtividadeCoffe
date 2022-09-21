package br.com.etecia.atividade;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterCoffe extends  RecyclerView.Adapter<AdapterCoffe.MyViewHolder> {

    private Context mContext; //É a classe onde estou
    private List<Cafe> mData; //O objeto que irá representar os dados


    //Construtor da classe
    public AdapterCoffe(Context mContext, List<Cafe> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.modelo_itens, parent, false);

        return new MyViewHolder(view);
    }

    //Será realizada a montagem dos dados.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        //passando valores para o RecyclerView
        holder.TvNomeiten.setText(mData.get(position).getTxtNomeiten());
        holder.TvimgCoffe.setImageResource(mData.get(position).getIdImgcoffe());
        holder.TvdescCafe.setText(mData.get(position).getDescCafe());
    }

    @Override
    public int getItemCount() {
        //tamanho da lista de livros
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView TvNomeiten;
        ImageView TvimgCoffe;
        TextView TvdescCafe;


        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            TvNomeiten = itemView.findViewById(R.id.txtNomeiten);
            TvimgCoffe = itemView.findViewById(R.id.idImgcoffe);
            TvdescCafe = itemView.findViewById(R.id.descCafe);


        }
    }
}
