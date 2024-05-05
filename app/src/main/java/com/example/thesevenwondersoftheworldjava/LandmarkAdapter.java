package com.example.thesevenwondersoftheworldjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thesevenwondersoftheworldjava.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {

    ArrayList<Landmark> landmarkArrayList;

    // LandmarkAdapter sınıfının yapıcı metodu
    public LandmarkAdapter(ArrayList<Landmark> landmarkArrayList) {
        this.landmarkArrayList = landmarkArrayList;
    }
    // ViewHolder sınıfını oluşturmak için kullanılan metot
    @NonNull
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // RecyclerView'ın satır görünümünü şişirerek bir View oluşturulur
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    // ViewHolder ile verilerin bağlanmasını sağlayan metot
    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, @SuppressLint("RecyclerView") int position) {
        // TextView'a harika adını ayarlar
        holder.binding.recyclerViewTextView.setText(landmarkArrayList.get(position).name);

        // Her bir öğeye tıklanma işlevselliği eklenir
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tıklanan harikanın ayrıntılarının gösterileceği DetailsActivity'e geçiş yapılır
                Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);


                // Singleton örneği kullanılarak seçilen harika diğer aktivitelere iletilir
                Singleton singleton= Singleton.getInstance();
                singleton.setSentLandmark(landmarkArrayList.get(position));
                // Intent ile DetailsActivity başlatılır
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }
    // Veri kümesindeki öğe sayısını döndüren metot
    @Override
    public int getItemCount() {
        return landmarkArrayList.size();
    }

    // ViewHolder sınıfı, RecyclerView'ın her öğesini tutar
    public class LandmarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        // ViewHolder yapıcı metodu
        public LandmarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
