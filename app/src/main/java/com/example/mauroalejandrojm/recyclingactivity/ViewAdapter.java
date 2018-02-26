package com.example.mauroalejandrojm.recyclingactivity;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

/**
 * Created by mauroalejandrojm on 2/26/18.
 */

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.MyViewHolder> {

    private LayoutInflater inflater;
    private List<information> data = Collections.emptyList();

    public ViewAdapter(Context context, List<information> data){
        inflater = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.row, parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        information information = data.get(position);
        holder.display.setText(information.title);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView display;
        public MyViewHolder(View itemView) {
            super(itemView);
            display = (TextView) itemView.findViewById(R.id.textviewrow);
        }
    }
}
