package com.example.android.quakereport;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

public class ItemArrayAdapter extends RecyclerView.Adapter<ItemArrayAdapter.ViewHolder> {


    private Context context;
    private List<Item> Item;

    public ItemArrayAdapter(Context context, List Item) {
        this.context = context;
        this.Item = Item;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(Item.get(position));

        Item pu = Item.get(position); //pu is

        holder.mag.setText(pu.getMag());
        holder.place.setText(pu.getPlace());
        holder.date.setText(pu.getDate());

    }

    @Override
    public int getItemCount() {
        return Item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView mag;
        private TextView place;
        private TextView date;

        private ViewHolder(View itemView) {
            super(itemView);

            mag =  itemView.findViewById(R.id.tvMag);
            place = itemView.findViewById(R.id.tvPlace);
            date = itemView.findViewById(R.id.tvDate);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Item cpu = (Item) view.getTag();
                    Toast.makeText(view.getContext(), cpu.getPlace()+" is "+ cpu.getMag(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}