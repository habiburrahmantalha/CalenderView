package com.tree.calenderview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Talha on 4/5/2017.
 */

class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.ViewHolder> {
    Context context;
    ArrayList<DayModel> dayModelArrayList;


    public CalendarAdapter(Context context, ArrayList<DayModel> dayModelArrayList) {
        this.context = context;
        this.dayModelArrayList = dayModelArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_calender_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dayModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.tDay)
        TextView tDay;
        @BindView(R.id.iImage)
        ImageView iImage;
        @BindView(R.id.cv)
        CardView cv;



        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            cv.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context,dayModelArrayList.get(getAdapterPosition()).day+"",Toast.LENGTH_SHORT).show();
        }
    }
}
