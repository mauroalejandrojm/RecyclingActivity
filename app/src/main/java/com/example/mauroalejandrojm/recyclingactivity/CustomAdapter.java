package com.example.mauroalejandrojm.recyclingactivity;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by mauroalejandrojm on 2/26/18.
 */

public class CustomAdapter extends BaseAdapter {

    private Context contex;
    private String[] data;
    public int i;

    public CustomAdapter(Context contex, String[] values){
        this.contex = contex;
        this.data = values;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[i];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String text = data[i];
        if (convertView==null){
            LayoutInflater inflater =contex.getSystemService(Context.LAYOUT_INFLATER_SERVICE)
            convertView = inflater.inflate(R.layout.row,null);
        }
        TextView display = convertView.findViewById(R.id.textviewrow);
        return null;
    }
}
