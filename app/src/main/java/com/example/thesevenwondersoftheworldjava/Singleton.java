package com.example.thesevenwondersoftheworldjava;

public class Singleton {

     private Landmark sentLandmark;// Seçilen harika nesnesini tutmak için özel bir değişken tanımlanır.
     private static Singleton singleton; // Tek örnek oluşturmak için bir örnek değişkeni tanımlanır.

    // Singleton sınıfının kurucu yöntemi, dış dünya tarafından erişilemesini engellemek için özel olarak tanımlanır.
    private Singleton() {


    }

    // Seçilen harika nesnesini döndüren yöntem.
    public Landmark getSentLandmark(){
        return sentLandmark;
    }


    // Seçilen harika nesnesini ayarlayan yöntem.
    public void setSentLandmark(Landmark sentLandmark){
        this.sentLandmark=sentLandmark;
    }


    // Singleton örneğini döndüren yöntem.
    public static Singleton getInstance(){
        // Eğer örnek henüz oluşturulmadıysa, yeni bir örnek oluşturulur.
        if(singleton==null){
            singleton = new Singleton();
        }
        // Oluşturulan veya mevcut olan örnek döndürülür.
        return singleton;
    }
}
