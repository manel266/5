package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MVH> {
    Context c;
    String[] titre,stitre;
    Integer [] image;

    public ListAdapter(Context c, String[] titre, String[] stitre, Integer[] image) {
        this.c = c;
        this.titre = titre;
        this.stitre = stitre;
        this.image = image;
    }

    public ListAdapter(String[] titre, String[] stitre) {
        this.titre = titre;
        this.stitre = stitre;
    }

    @NonNull
    @Override
    public MVH onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclelayout,parent,false);
        ListAdapter.MVH mvh = new ListAdapter.MVH(v);
        return mvh ;
    }

    @Override
    public int getItemCount() {
        return titre.length;
    }

    @Override
    public void onBindViewHolder(@NonNull  MVH holder,  int i) {
        holder.tit.setText(titre[i]);
        holder.Stit.setText(titre[i]);
        holder.img.setImageResource(image[i]);
    }

    public class MVH extends RecyclerView.ViewHolder{
        TextView tit,Stit;
        ImageView img;
        public MVH(@NonNull View itemView) {
            super(itemView);
            tit = itemView.findViewById((R.id.textView));
            Stit = itemView.findViewById((R.id.textView));
            img = itemView.findViewById(R.id.imageView);

        }
    }
}
