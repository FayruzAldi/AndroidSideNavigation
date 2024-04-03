package com.example.androiddrawersamping;

public class items {
    String nama;
    String image;
    String deskripsi;

    public String getNama() {
        return nama;
    }
    public String getImage() {
        return image;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

    public items(String nama, String image, String deskripsi) {
        this.nama = nama;
        this.image = image;
        this.deskripsi = deskripsi;
    }
}