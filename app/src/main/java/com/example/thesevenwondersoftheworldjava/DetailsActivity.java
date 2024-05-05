package com.example.thesevenwondersoftheworldjava;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.thesevenwondersoftheworldjava.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding; // Veri bağlamak için kullanılan binding değişkeni



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);




        //  Singleton desenini kullanarak seçilen harikanın bilgilerini alır
        Singleton singleton = Singleton.getInstance();
        Landmark selectedLandmark = singleton.getSentLandmark(); // Seçilen harika bilgilerini Singleton aracılığıyla alır



        // Arayüzdeki TextView ve ImageView'e seçilen harikanın bilgilerini yerleştirir
        binding.nameText.setText(selectedLandmark.name); // Harikanın adını gösteren TextView'e adı yerleştirir
        binding.countryText.setText(selectedLandmark.country); // Harikanın ülkesini gösteren TextView'e ülke adını yerleştirir
        binding.imageView.setImageResource(selectedLandmark.image); // Harikanın resmini gösteren ImageView'e resmi yerleştirir


    }
}