package com.training.etiya.java;


public class Arac extends Object {

    private int uzunluk;
    private int agirlik;

    public void sagaDon() {

    }

    public void solaDon() {

    }

    @Override
    public String toString() {
        return "Arac [uzunluk=" + this.uzunluk + ", agirlik=" + this.agirlik + "]";
    }


    public int getUzunluk() {
        return this.uzunluk;
    }


    public void setUzunluk(final int uzunlukParam) {
        if (uzunlukParam < 0) {
            throw new IllegalArgumentException("Eksi olamaz");
        }
        this.uzunluk = uzunlukParam;
    }


    public int getAgirlik() {
        return this.agirlik;
    }


    public void setAgirlik(final int agirlikParam) {
        this.agirlik = agirlikParam;
    }


}
