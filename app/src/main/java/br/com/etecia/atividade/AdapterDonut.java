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

public class AdapterDonut extends RecyclerView.Adapter<AdapterDonut.ViewHolderDonut> {

    private Context dContext;
    private List<Donut> dData;

    public AdapterDonut(Context dContext, List<Donut> dData) {
        this.dContext = dContext;
        this.dData = dData;

    }


    @NonNull
    @Override
    public AdapterDonut.ViewHolderDonut onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

        LayoutInflater dInflater = LayoutInflater.from(dContext);
        view = dInflater.inflate(R.layout.modelo_donut, parent, false);

        return new AdapterDonut.ViewHolderDonut(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDonut.ViewHolderDonut holder, final int position) {
        //passando valores para o RecyclerView
        holder.TvNomeDonut.setText(dData.get(position).getTxtNomeDonut());
        holder.TvimgDonut.setImageResource(dData.get(position).getIdImgDonut());
        holder.TvdescDonut.setText(dData.get(position).getDescDonut());
    }

    @Override
    public int getItemCount() {
        return dData.size();
    }

    public static class ViewHolderDonut extends RecyclerView.ViewHolder {

        TextView TvNomeDonut;
        ImageView TvimgDonut;
        TextView TvdescDonut;

        public ViewHolderDonut(@NonNull View itemView) {

            super(itemView);

            TvNomeDonut = itemView.findViewById(R.id.txtNomeDonut);
            TvimgDonut = itemView.findViewById(R.id.idImgDonut);
            TvdescDonut = itemView.findViewById(R.id.descDonut);


        }
    }
}
