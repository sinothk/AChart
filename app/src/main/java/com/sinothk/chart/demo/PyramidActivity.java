package com.sinothk.chart.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pyramid;
import com.anychart.core.ui.Legend;
import com.anychart.enums.Align;
import com.anychart.enums.LegendLayout;

import java.util.ArrayList;
import java.util.List;

public class PyramidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Pyramid pyramid = AnyChart.pyramid();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("电视宣传", 6371664));
        data.add(new ValueDataEntry("电台宣传", 7216301));
        data.add(new ValueDataEntry("广告传单", 1486621));
        data.add(new ValueDataEntry("开始前广告", 1386622));

        pyramid.data(data);

        Legend legend = pyramid.legend();
        legend.enabled(true);
        legend.position("outside-right");
        legend.itemsLayout(LegendLayout.VERTICAL);
        legend.align(Align.TOP);

        pyramid.labels(false);

        anyChartView.setChart(pyramid);
    }
}
