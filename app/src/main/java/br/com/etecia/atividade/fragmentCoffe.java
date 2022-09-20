package br.com.etecia.atividade;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class fragmentCoffe extends Fragment {


    List<Cafe> lstCafes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_coffe, container, false);

        RecyclerView mRecyclerView = v.findViewById(R.id.recyclerCoffe);

        lstCafes = new ArrayList<>();

        lstCafes.add(new Cafe("Café Preto",R.drawable.coffeimg, "Café Preto 250ml"));
        lstCafes.add(new Cafe("Café Pingado",R.drawable.cafepingado, "Café Pingado 250ml"));
        lstCafes.add(new Cafe("Café Cortado",R.drawable.cafecortado, "Café Cortado 250ml "));
        lstCafes.add(new Cafe("Café Au Lait",R.drawable.cafecomleite, "Café Com Leite 250ml"));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstCafes);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        mRecyclerView.hasFixedSize();
        mRecyclerView.setAdapter(recyclerViewAdapter);

        return v;
    }
}