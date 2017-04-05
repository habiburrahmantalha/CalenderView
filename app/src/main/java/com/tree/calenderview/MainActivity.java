package com.tree.calenderview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.rvCalender)
    RecyclerView rvCalender;
    RecyclerView.Adapter rvCalenderAdapter;
    RecyclerView.LayoutManager rvCalenderLayoutManager;
    ArrayList<DayModel> dayModelArrayList;
    @BindView(R.id.bPrevious)
    Button bPrevious;
    @BindView(R.id.bNext)
    Button bNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.MONTH);
        setMonth();



    }

    @OnClick({R.id.bPrevious, R.id.bNext})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.bPrevious:
                setMonth();
                break;
            case R.id.bNext:
                setMonth();
                break;
        }
    }
    void setMonth(){

        Calendar calendar = Calendar.getInstance();
        calendar.get(Calendar.MONTH);
        calendar.get(Calendar.DAY_OF_MONTH);


        dayModelArrayList = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            dayModelArrayList.add(new DayModel(i + 1, 0));
        }

        rvCalenderAdapter = new CalendarAdapter(this, dayModelArrayList);
        rvCalenderLayoutManager = new GridLayoutManager(this, 7);
        rvCalender.setLayoutManager(rvCalenderLayoutManager);
        rvCalender.setAdapter(rvCalenderAdapter);

    }

}
