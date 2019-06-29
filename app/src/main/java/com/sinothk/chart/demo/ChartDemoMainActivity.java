package com.sinothk.chart.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChartDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pieChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, PieChartActivity.class));
    }

    public void columnChartEvent(View view) {
        startActivity(new Intent(ChartDemoMainActivity.this, ColumnChartActivity.class));
    }
}