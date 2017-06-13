package com.example.asus.boluomidemo.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.boluomidemo.Bean.Fiction;
import com.example.asus.boluomidemo.R;

import java.util.List;

/**
 * Created by ASUS on 2017/6/13.
 */

public class MyRexyclerAdapter extends RecyclerView.Adapter{
    private Context context;
    private List<Fiction> list;
    public MyRexyclerAdapter(Context context, List<Fiction> list){
        this.context=context;
        this.list=list;
    }

    static class MyHolder extends RecyclerView.ViewHolder{
        private ImageView itme_iv;
        private TextView itme_tv;
        private TextView itme_tvtwo;
        public MyHolder(View itemView) {
            super(itemView);
            itme_iv= (ImageView) itemView.findViewById(R.id.itme_iv);
            itme_tv= (TextView) itemView.findViewById(R.id.itme_tv);
            itme_tvtwo= (TextView) itemView.findViewById(R.id.itme_tvtwo);
        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.recycler_itme,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder holders = (MyHolder) holder;

        holders.itme_iv.setImageResource(list.get(position).getImages());
        holders.itme_tv.setText(list.get(position).getTitles());
        holders.itme_tvtwo.setText(list.get(position).getTitlestwo());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
