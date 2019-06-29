package com.sinothk.chart.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChartDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo);
    }

    public void pieChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, PieChartActivity.class));
    }

    public void columnChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, ColumnChartActivity.class));
    }

    public void lineChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, LineChartActivity.class));
    }

    public void paretoChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, ParetoChartActivity.class));
    }

    public void radarChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, RadarChartActivity.class));
    }

    public void funnelChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, FunnelChartActivity.class));
    }

    public void pyramidChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, PyramidActivity.class));
    }
}
