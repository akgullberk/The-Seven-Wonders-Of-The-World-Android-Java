package com.example.thesevenwondersoftheworldjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.example.thesevenwondersoftheworldjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark giza = new Landmark("The Great Pyramid of Giza","Egypt",R.drawable.gizapyramid);
        Landmark babylon = new Landmark("The Hanging Gardens of Babylon","Babylon",R.drawable.babylongardens);
        Landmark zeus = new Landmark("The Statue of Zeus at Olympia","Olympia",R.drawable.statuezeus);
        Landmark artemis = new Landmark("The Temple of Artemis at Ephesus","Ephesus",R.drawable.templeartemis);
        Landmark halicarnassus = new Landmark("The Mausoleum at Halicarnassus","Halicarnassus",R.drawable.halicarnassus);
        Landmark rhodes = new Landmark("The Colossus of Rhodes","Rodos",R.drawable.statuezeus);
        Landmark alexandria = new Landmark("The Lighthouse of Alexandria","Alexandria",R.drawable.alexandrialighthouse);

        landmarkArrayList.add(giza);
        landmarkArrayList.add(babylon);
        landmarkArrayList.add(zeus);
        landmarkArrayList.add(artemis);
        landmarkArrayList.add(halicarnassus);
        landmarkArrayList.add(rhodes);
        landmarkArrayList.add(alexandria);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList()));
        binding.listView.setAdapter(arrayAdapter);

    }
}