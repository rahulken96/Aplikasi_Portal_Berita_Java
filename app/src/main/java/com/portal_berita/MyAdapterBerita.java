package com.portal_berita;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ItemTouchUIUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterBerita extends RecyclerView.Adapter<MyAdapterBerita.MyViewHolder> {

    private List<ModalData> mDataList;
    private Context context;

    public MyAdapterBerita(List<ModalData> dataList,Context context) {
        this.mDataList = dataList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.home_file,parent,false);

        return new MyViewHolder(view);
    }

    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        final ModalData berita =mDataList.get(position);

        holder.imageView.setImageResource(mDataList.get(position).getGambar());
        holder.text1.setText(mDataList.get(position).getJudul());
        holder.text2.setText(mDataList.get(position).getDesc());

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, BeritaUtama.class);

                intent.putExtra("Foto", mDataList.get(position).getGambar());
                intent.putExtra("Judul", mDataList.get(position).getJudul());
                intent.putExtra("Deskripsi", mDataList.get(position).getDesc());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView text1,text2;
        ConstraintLayout constraintLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            text1 = itemView.findViewById(R.id.textView);
            text2 = itemView.findViewById(R.id.textView2);
            constraintLayout = itemView.findViewById(R.id.consLay);
        }
    }
}

//    String data1[],data2[];
//    Context context;
//
//
//    public MyAdapterBerita(Context ct, String s1[], String s2[]){
//        data1 = s1;
//        data2 = s2;
//        context = ct;
//    }
