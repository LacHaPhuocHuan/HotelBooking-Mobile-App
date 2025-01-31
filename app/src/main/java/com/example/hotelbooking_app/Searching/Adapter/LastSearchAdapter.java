package com.example.hotelbooking_app.Searching.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelbooking_app.R;
import com.example.hotelbooking_app.Searching.Domain.LastSearchDomain;

import java.util.ArrayList;

public class LastSearchAdapter extends RecyclerView.Adapter<LastSearchAdapter.lastSearchHolder> {
    ArrayList<LastSearchDomain> data;
    public LastSearchAdapter(ArrayList<LastSearchDomain> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public lastSearchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.searching_rv_last_search, parent, false);
        return new lastSearchHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull lastSearchHolder holder, int position) {
        holder.tvName.setText(data.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class lastSearchHolder extends RecyclerView.ViewHolder {
        TextView tvName;

        public lastSearchHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tvName);
        }
    }
}
