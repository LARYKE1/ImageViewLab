package com.example.imageviewlab;

import android.media.ImageReader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class imageAdaptor extends RecyclerView.Adapter<imageAdaptor.myviewholder> {

    ArrayList<imageModel> images;

    public imageAdaptor(ArrayList<imageModel> images) {
        this.images=images;
    }


    @NonNull
    @Override
    public imageAdaptor.myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.single_layout,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull imageAdaptor.myviewholder holder, int position) {
        holder.setData(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }


    class myviewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,desc;


        public myviewholder(@NonNull View itemView) {
            super(itemView);

            imageView=(ImageView) itemView.findViewById(R.id.imageView);
            title=(TextView) itemView.findViewById(R.id.textView);
            desc=(TextView) itemView.findViewById(R.id.textDescription);
        }

        void setData(imageModel obj){
            imageView.setImageResource(obj.getPath());
            title.setText(obj.getTitle());
            desc.setText(obj.getDesc());


        }
    }
}
