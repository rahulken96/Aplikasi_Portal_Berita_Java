package com.portal_berita;

public class ModalData{
    int gambar;
    int judul;
    String desc;

    public ModalData(int gambar, int judul, String desc) {
        this.gambar = gambar;
        this.judul = judul;
        this.desc = desc;
    }

    public int getGambar() {
        return gambar;
    }

    public int getJudul() {
        return judul;
    }

    public String getDesc() {
        return desc;
    }
}
