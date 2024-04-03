package com.example.androiddrawersamping;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ViewHolder> {

    private List<items> itemsList;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public AdapterList(List<items> itemsList, Context context) {
        this.itemsList = itemsList;
        this.context = context;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final items currentItem = itemsList.get(position);

        holder.tvName.setText(currentItem.getNama());
        Glide.with(context)
                .load(currentItem.getImage())
                .placeholder(R.drawable.loading)
                .error(R.drawable.question_mark)
                .into(holder.imageView);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startKhasActivity(currentItem);
            }
        });
    }

    private void startKhasActivity(items currentItem) {
        Intent intent = new Intent(context, Khas.class);
        intent.putExtra("nama", currentItem.getNama());
        intent.putExtra("img", currentItem.getImage());
        intent.putExtra("deskripsi", currentItem.getDeskripsi());
        context.startActivity(intent);
    }


    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDescription;
        ImageView imageView;

        ViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(items currentItem);
    }
}

