package com.example.estationery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.ViewHolder> {

    Context context;
    int[] images;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView rowImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            rowImage = itemView.findViewById(R.id.imageView);
        }
    }

    public ProgramAdapter(Context context, int[] images){
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public ProgramAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.single_item,parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramAdapter.ViewHolder holder, int position) {
        holder.rowImage.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
