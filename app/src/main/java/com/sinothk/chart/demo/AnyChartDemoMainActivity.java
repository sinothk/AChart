package com.sinothk.chart.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.sinothk.chart.demo.ox.OXViewDemoMainActivity;

public class AnyChartDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo);
    }

    public void oXViewChartsEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, OXViewDemoMainActivity.class));
    }

    public void pieChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, PieChartActivity.class));
    }

    public void columnChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, ColumnChartActivity.class));
    }

    public void lineChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, LineChartActivity.class));
    }

    public void paretoChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, ParetoChartActivity.class));
    }

    public void radarChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, RadarChartActivity.class));
    }

    public void funnelChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, FunnelChartActivity.class));
    }

    public void pyramidChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, PyramidActivity.class));
    }

    public void windSpeedEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, WindSpeedActivity.class));
    }

    public void pertChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, PertChartActivity.class));
    }

    public void verticalChartEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, VerticalChartActivity.class));
    }

    public void circularGaugeEvent(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, CircularGaugeActivity.class));
    }

    public void barChart1Event(View view) {
        startActivity(new Intent(AnyChartDemoMainActivity.this, BarChartActivity.class));
    }
}
