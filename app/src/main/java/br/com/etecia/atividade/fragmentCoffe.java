package br.com.etecia.atividade;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
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

        lstCafes = new ArrayList<>();

        lstCafes.add(new Cafe("Black Cock",R.drawable.coffeimg, "café gostoso pra carai"));
        lstCafes.add(new Cafe("Pingado",R.drawable.cafepingado, "café gostoso pra carai"));
        lstCafes.add(new Cafe("Black cofi",R.drawable.coffeimg, "café gostoso pra carai"));
        lstCafes.add(new Cafe("CAFEZIN",R.drawable.cafepingado, "café gostoso pra carai"));

        RecyclerView mRecyclerView = findViewById(R.id.recyclerCoffe);

        return v;
    }
}