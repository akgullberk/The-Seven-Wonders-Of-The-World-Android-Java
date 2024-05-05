package com.example.thesevenwondersoftheworldjava;

import java.io.Serializable;


// Serializable arabirimi, bir nesnenin durumunu serileştirmek ve serileştirmek için kullanılır.
public class Landmark implements Serializable {


    // Landmark sınıfının özellikleri (fields)
    String name,country; // Harika adı // Harikanın bulunduğu ülke
    int image; // Harikanın resmi (Drawable ID)


    // Landmark sınıfının yapıcı metodu (constructor)
    public  Landmark(String name,String country,int image){
        // Parametrelerden alınan değerler, sınıfın özelliklerine atanır.
        this.name=name;
        this.country=country;
        this.image=image;
    }
}
