package com.chs.easychartwidget.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.chs.easychartwidget.R;
import com.chs.easychartwidget.entity.BarChartEntity;
import com.chs.easychartwidget.entity.ChartEntity;
import com.chs.easychartwidget.widget.BarChart;
import com.chs.easychartwidget.widget.BarChart2;
import com.chs.easychartwidget.widget.BarChartNew;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：chs on 2016/9/6 16:07
 * 邮箱：657083984@qq.com
 */
public class BarChartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);

        //老柱状图
        BarChart barChart = (BarChart) findViewById(R.id.chart);
        List<ChartEntity> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(new ChartEntity(String.valueOf(i), (float) (Math.random() * 1000)));
        }
        barChart.setData(data);
        barChart.setOnItemBarClickListener(new BarChart.OnItemBarClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(BarChartActivity.this, "点击了：" + position, Toast.LENGTH_SHORT).show();
            }
        });
        barChart.startAnimation(2000);


        //新柱状图
        BarChartNew barChartNew1 = (BarChartNew) findViewById(R.id.chart_new_1);

        List<BarChartEntity> datas = new ArrayList<>();
        datas.add(new BarChartEntity("特种设备组", new Float[]{(float) (Math.random() * 1000)}));
        for (int i = 0; i < 20; i++) {
            datas.add(new BarChartEntity("第" + String.valueOf(i) + "项", new Float[]{(float) (Math.random() * 1000)}));
        }
        barChartNew1.setOnItemBarClickListener(new BarChartNew.OnItemBarClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(BarChartActivity.this, "点击了：" + position, Toast.LENGTH_SHORT).show();
            }
        });
        barChartNew1.setData(datas, new int[]{Color.parseColor("#6FC5F4")}, "分组", "数量");
        barChartNew1.startAnimation();

        //新柱状图多种颜色
        BarChartNew barChartNew2 = (BarChartNew) findViewById(R.id.chart_new_2);

        List<BarChartEntity> datas1 = new ArrayList<>();
        datas1.add(new BarChartEntity("2013", new Float[]{1003f, 500f, 600f, 45f, 99f}));
        datas1.add(new BarChartEntity("2014", new Float[]{1003f, 500f, 600f, 45f, 99f}));
        datas1.add(new BarChartEntity("2015", new Float[]{890f, 456f, 123f, 45f, 99f}));
        datas1.add(new BarChartEntity("2016", new Float[]{456f, 741f, 654f, 45f, 99f}));
        datas1.add(new BarChartEntity("2017", new Float[]{258f, 951f, 12f, 45f, 99f}));
        datas1.add(new BarChartEntity("2018", new Float[]{163f, 163f, 163f, 163f, 163f}));
        datas1.add(new BarChartEntity("2019", new Float[]{163f, 163f, 163f, 163f, 163f}));
        barChartNew2.setData(datas1,
                new int[]{
                        Color.parseColor("#6FC5F4"),
                        Color.parseColor("#78DA9F"),
                        Color.parseColor("#FCAE84"),
                        Color.parseColor("#Ff0084"),
                        Color.parseColor("#F23E84")
                }
                , "分组", "数量");

        barChartNew2.setColor("#78DA9F", "#F23E84", "#6FC5F4");
//        barChartNew2.setColor("#6FC5F4", "#78DA9F", "#FCAE84", "#Ff0084", "#F23E84");
        /**
         //         * 画笔 轴 刻度 柱子 点击后的柱子 单位
         //         */
//        private Paint axisPaint, textPaint, barPaint, borderPaint, unitPaint;

//        barChartNew2.setOnItemBarClickListener(new BarChartNew.OnItemBarClickListener() {
//            @Override
//            public void onClick(int position) {
//                Toast.makeText(BarChartActivity.this,"点击了："+position,Toast.LENGTH_SHORT).show();
//            }
//        });
        barChartNew2.setClickable(false);
        barChartNew2.startAnimation();

        //Y轴正负都有
        initBarChart3();
    }


    private void initBarChart3() {
        BarChart2 barChart = findViewById(R.id.chart_new_3);
        List<BarChartEntity> data = new ArrayList<>();
//        data.add(new BarChartEntity("特种设备组", new Float[]{(float) (Math.random()*1000)}));
        for (int i = 0; i < 20; i++) {
//            data.add(new BarChartEntity("第"+String.valueOf(i)+"项", new Float[]{(float) (Math.random()*-1000)}));
            if (i % 2 == 0) {
                data.add(new BarChartEntity("第" + String.valueOf(i) + "项", new Float[]{(float) (Math.random() * 1000)}));
            } else {
                data.add(new BarChartEntity("第" + String.valueOf(i) + "项", new Float[]{(float) (Math.random() * -1000)}));
            }
        }
        barChart.setData(data, new int[]{Color.parseColor("#6FC5F4")}, "分组", "数量", 500, -400);
        barChart.startAnimation();
    }
}
