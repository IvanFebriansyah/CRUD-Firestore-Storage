package com.ivan.pertemuan12;

public class ClassContact {
    private String nama, telepon, sosmed,alamat,foto;

    public ClassContact(){

    }

    public ClassContact(String nama, String telepon, String sosmed, String alamat, String foto) {
        this.nama = nama;
        this.telepon = telepon;
        this.sosmed = sosmed;
        this.alamat = alamat;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getSosmed() {
        return sosmed;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getFoto() {
        return foto;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
