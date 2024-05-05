package com.example.thesevenwondersoftheworldjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.thesevenwondersoftheworldjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding; // XML dosyasındaki bileşenlere erişmek için bağlantı noktası
    ArrayList<Landmark> landmarkArrayList; // Harika nesnelerinin listesi


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>(); // Harika nesnelerinin listesini oluştur


        // Harika nesnelerini oluştur ve listeye ekle
        Landmark giza = new Landmark("The Great Pyramid of Giza","The Great Pyramid of Giza was built around 2600 BC by the Egyptians and took 20 years to complete! It’s the largest of the three Giza pyramids and was constructed as a tomb for the Egyptian pharaoh named Khufu. The pyramid’s perfect symmetry and unparalleled height (146.5 metres) made it an extremely impressive sight that was visited by ancient tourists. Fun fact: it was the tallest human-made structure on earth for almost 4,000 years!",R.drawable.gizapyramid);
        Landmark babylon = new Landmark("The Hanging Gardens of Babylon","The Hanging Gardens of Babylon were built by King Nebuchadnezzar II as a gift for his wife, who missed the mountains and flowers of her homeland. They are believed to have been constructed around 600 BC in the ancient city of Babylon, which is now part of Iraq.\n" +
                "\n" +
                "Babylon was a desert-like place, so creating a sanctuary of lush green trees, shrubs and vines is a quite extraordinary achievement! The gardens were apparently destroyed by earthquake in the first century AD.\n" +
                "\n" +
                "It is possible, however, that these mysterious gardens were purely mythical and never actually existed, as no archaeological evidence of them has ever been discovered..",R.drawable.babylongardens);
        Landmark zeus = new Landmark("The Statue of Zeus at Olympia","The Statue of Zeus stood at an enormous 12 metres high! It was built sometimes around 432 BC by a Greek sculptor named Phidas to honour the chief of the Greek gods. It was located within the Temple of Zeus in Olympia, which was also the site of the first Olympic Games. The statue showed Zeus seated on a resplendent throne, with ivory skin and golden robes. It was designed to inspire awe in worshippers and is considered to have been pagan, which would explain why the statue was removed after the rise of Christianity.\n" +
                "\n",R.drawable.statuezeus);
        Landmark artemis = new Landmark("The Temple of Artemis at Ephesus","The Temple of Artemis was built in the Greek colony of Ephesus, which is now part of Turkey. It was built in 550 BC to honour Artemis, the goddess of hunting. The magnificent build took over 120 years to build and only one night to destroy! In 356 BC, it was tragically set ablaze by a man named Herostratus, who did it simply in hopes of becoming known for destroying such a beautiful creation.\n" +
                "\n",R.drawable.templeartemis);
        Landmark halicarnassus = new Landmark("The Mausoleum at Halicarnassus","The Mausoleum at Halicarnassus was built between 353 and 350 BC near Bodrum in Turkey as a tomb for the Persian satrap (governor) Mausolus. Its construction was ordered by his wife, Artemisia II, who was so distraught at his death that she felt he deserved an extravagant tomb, worthy of a king.\n" +
                "\n" +
                "The impressive 41-metre-high structure combined Greek, Lycian and Egyptian architecture. No expense was spared; the mausoleum was filled with beautiful marble statues, temples, sculptures and friezes.\n" +
                "\n" +
                "The Mausoleum was the second longest surviving ancient wonder, after the Great Pyramid of Giza. It was eventually destroyed by earthquakes between the 12th and 15th century AD.\n" +
                "\n"
                ,R.drawable.halicarnassus);
        Landmark rhodes = new Landmark("The Colossus of Rhodes","At 33 metres, the Colossus was the tallest statue in the ancient world – approximately the height of the modern Statue of Liberty. It was built by a Greek sculptor named Chares of Lindos, sometime between 292 and 280 BC.\n" +
                "\n" +
                "The statue was built to honour Helios, the Greek sun god, in celebration of the successful defence of the island after a year-long siege. Legend says that the people of Rhodes melted down abandoned bronze and iron weapons to help with its creation.\n" +
                "\n" +
                "Unfortunately, the magnificent structure was destroyed by an earthquake in 226 BC and remained in pieces on the ground for hundreds of years.",R.drawable.rhodescolossus);
        Landmark alexandria = new Landmark("The Lighthouse of Alexandria","The Lighthouse at Alexandria, estimated to have been between 115 and 145 metres tall, would guide ships through the shallow, rocky waters of Alexandria’s harbour. It was constructed in 280 BC on the Island of Pharos, in Egypt.\n" +
                "\n" +
                "It used a mirror to reflect the sun's rays during the day and a fire at night. The light was supposedly visible over 30 miles away!\n" +
                "\n" +
                "Unfortunately, much like the majority of the ancient wonders, the lighthouse was damaged by a number of earthquakes, before completely collapsing during the 15th century..",R.drawable.alexandrialighthouse);


        // Harika nesnelerini listeye ekle
        landmarkArrayList.add(giza);
        landmarkArrayList.add(babylon);
        landmarkArrayList.add(zeus);
        landmarkArrayList.add(artemis);
        landmarkArrayList.add(halicarnassus);
        landmarkArrayList.add(rhodes);
        landmarkArrayList.add(alexandria);


        // RecyclerView için LinearLayoutManager ayarla
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Harika öğeleri göstermek için bir adaptör oluştur ve RecyclerView'a ata
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

    }
}