package com.portal_berita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class BeritaUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita_utama);

        TextView txJudul = findViewById(R.id.textJudul);
        TextView txDesc = findViewById(R.id.textDesc);
        ImageView imgBerita = findViewById(R.id.imageBerita);

        Glide.with(this).load(getIntent().getIntExtra("Foto",0)).into(imgBerita);
        txJudul.setText(getIntent().getIntExtra("Judul",0));
        txDesc.setText(getIntent().getStringExtra("Deskripsi"));

    }
}