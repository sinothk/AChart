package com.sinothk.chart.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Radar;
import com.anychart.core.radar.series.Line;
import com.anychart.data.Mapping;
import com.anychart.data.Set;
import com.anychart.enums.Align;
import com.anychart.enums.MarkerType;

import java.util.ArrayList;
import java.util.List;

public class RadarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Radar radar = AnyChart.radar();

        radar.title("统计对比雷达图：萨满vs战士vs神父");

        radar.yScale().minimum(0d);
        radar.yScale().minimumGap(0d);
        radar.yScale().ticks().interval(50d);

        radar.xAxis().labels().padding(5d, 5d, 5d, 5d);

        radar.legend()
                .align(Align.CENTER)
                .enabled(true);

        List<DataEntry> data = new ArrayList<>();
        data.add(new CustomDataEntry("强度", 136, 199, 43));
        data.add(new CustomDataEntry("敏捷性", 79, 125, 56));
        data.add(new CustomDataEntry("耐力", 149, 173, 101));
        data.add(new CustomDataEntry("智力", 135, 33, 202));
        data.add(new CustomDataEntry("精神", 158, 64, 196));

        Set set = Set.instantiate();
        set.data(data);
        Mapping shamanData = set.mapAs("{ x: 'x', value: 'value' }");
        Mapping warriorData = set.mapAs("{ x: 'x', value: 'value2' }");
        Mapping priestData = set.mapAs("{ x: 'x', value: 'value3' }");

        Line shamanLine = radar.line(shamanData);
        shamanLine.name("萨满");
        shamanLine.markers()
                .enabled(true)
                .type(MarkerType.CIRCLE)
                .size(3d);

        Line warriorLine = radar.line(warriorData);
        warriorLine.name("战士");
        warriorLine.markers()
                .enabled(true)
                .type(MarkerType.CIRCLE)
                .size(3d);

        Line priestLine = radar.line(priestData);
        priestLine.name("神父");
        priestLine.markers()
                .enabled(true)
                .type(MarkerType.CIRCLE)
                .size(3d);

        radar.tooltip().format("数值: {%Value}");

        anyChartView.setChart(radar);
    }

    private class CustomDataEntry extends ValueDataEntry {

        CustomDataEntry(String x, Number value, Number value2, Number value3) {
            super(x, value);
            setValue("value2", value2);
            setValue("value3", value3);
        }
    }
}
