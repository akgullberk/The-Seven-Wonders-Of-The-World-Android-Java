package com.example.thesevenwondersoftheworldjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    }
}