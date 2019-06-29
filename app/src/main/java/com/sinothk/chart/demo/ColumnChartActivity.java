package com.sinothk.chart.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Cartesian;
import com.anychart.core.cartesian.series.Column;
import com.anychart.enums.Anchor;
import com.anychart.enums.HoverMode;
import com.anychart.enums.Position;
import com.anychart.enums.TooltipPositionMode;

import java.util.ArrayList;
import java.util.List;

public class ColumnChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart_common);

        AnyChartView anyChartView = findViewById(R.id.any_chart_view);
        anyChartView.setProgressBar(findViewById(R.id.progress_bar));

        Cartesian cartesian = AnyChart.column();

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("胭脂", 80540));
        data.add(new ValueDataEntry("粉底霜", 94190));
        data.add(new ValueDataEntry("睫毛膏", 102610));
        data.add(new ValueDataEntry("唇彩", 110430));
        data.add(new ValueDataEntry("唇膏", 128000));
        data.add(new ValueDataEntry("指甲油", 143760));
        data.add(new ValueDataEntry("眉笔", 170670));
        data.add(new ValueDataEntry("眼线笔", 213210));
        data.add(new ValueDataEntry("眼影", 249980));

        Column column = cartesian.column(data);

        column.tooltip()
                .titleFormat("{%X}")
                .position(Position.CENTER_BOTTOM)
                .anchor(Anchor.CENTER_BOTTOM)
                .offsetX(0d)
                .offsetY(5d)
                .format("￥{%Value}{groupsSeparator: }");

        cartesian.animation(true);
        cartesian.title("按收入排名前10的化妆品");

        cartesian.yScale().minimum(0d);

        cartesian.yAxis(0).labels().format("￥{%Value}{groupsSeparator: }");

        cartesian.tooltip().positionMode(TooltipPositionMode.POINT);
        cartesian.interactivity().hoverMode(HoverMode.BY_X);

        cartesian.xAxis(0).title("产品");
        cartesian.yAxis(0).title("收益");

        anyChartView.setChart(cartesian);
    }
}
