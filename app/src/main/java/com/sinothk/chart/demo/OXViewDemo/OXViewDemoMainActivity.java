package com.sinothk.chart.demo.OXViewDemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sinothk.chart.demo.OXViewDemo.adapter.CommandRecyclerAdapter;
import com.sinothk.chart.demo.OXViewDemo.adapter.ViewHolder;
import com.sinothk.chart.demo.OXViewDemo.charts.HorizontalBarActivity;
import com.sinothk.chart.demo.OXViewDemo.charts.PieActivity;
import com.sinothk.chart.demo.OXViewDemo.charts.ProgressPieActivity;
import com.sinothk.chart.demo.OXViewDemo.charts.RoseActivity;
import com.sinothk.chart.demo.OXViewDemo.charts.VerticalBarActivity;
import com.sinothk.chart.demo.OXViewDemo.charts.XmStockChartActivity;
import com.sinothk.chart.demo.R;

import java.util.ArrayList;
import java.util.List;

// https://github.com/openXu/OXChart
public class OXViewDemoMainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private List<String> datas;

//    Handler handler = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//        }
//    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ox_view_chart_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        datas = new ArrayList<>();
        datas.add("南丁格尔玫瑰图");
        datas.add("饼状图");
        datas.add("进度环形图");
        datas.add("纵向柱状图");
        datas.add("横向柱状图");
        datas.add("折线图");
        datas.add("股票信息");

        recyclerView.setAdapter(new CommandRecyclerAdapter<String>(this, R.layout.activity_ox_view_list_item, datas) {
            @Override
            public void convert(ViewHolder holder, String str) {
                holder.setText(R.id.tv_name, str);
            }

            @Override
            public void onItemClick(String str, int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(OXViewDemoMainActivity.this, RoseActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(OXViewDemoMainActivity.this, PieActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(OXViewDemoMainActivity.this, ProgressPieActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(OXViewDemoMainActivity.this, VerticalBarActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(OXViewDemoMainActivity.this, HorizontalBarActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(OXViewDemoMainActivity.this, XmStockChartActivity.class));
                        break;
//                    case 6:
//                        startActivity(new Intent(MainActivity.this, XmStockChartActivity1.class));
//                        break;
                }
            }

        });

    }
}
