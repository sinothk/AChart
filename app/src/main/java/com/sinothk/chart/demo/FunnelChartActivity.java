package com.sinothk.chart.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Funnel;

import java.util.ArrayList;
import java.util.List;

public class FunnelChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Funnel funnel = AnyChart.funnel();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("网站访问", 528756));
        data.add(new ValueDataEntry("下载", 164052));
        data.add(new ValueDataEntry("有效联系人", 112167));
        data.add(new ValueDataEntry("有兴趣购买", 79128));
        data.add(new ValueDataEntry("购买", 79128));

        funnel.data(data);

        funnel.margin(new String[] { "10", "20%", "10", "20%" });

        funnel.baseWidth("70%")
                .neckWidth("17%");

        funnel.labels()
                .position("outsideleft")
                .format("{%X} - {%Value}");

        funnel.animation(true);

        anyChartView.setChart(funnel);
    }
}
