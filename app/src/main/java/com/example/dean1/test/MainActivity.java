package com.example.dean1.test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PieChart pieChart = findViewById(R.id.piechart);
        pieChart.setUsePercentValues(true);

        ArrayList<PieEntry> yvalues = new ArrayList<>();
        yvalues.add(new PieEntry(8f, "Studies"));
        yvalues.add(new PieEntry(15f, "Work"));
        yvalues.add(new PieEntry(12f, "Exercise"));
        yvalues.add(new PieEntry(25f, "Leisure"));


        PieDataSet dataSet = new PieDataSet(yvalues,"");

        //ArrayList<String> xVals = new ArrayList<>();

        /*xVals.add("Studies");
        xVals.add("Work");
        xVals.add("Exercise");
        xVals.add("Leisure");*/

        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        pieChart.setData(data);

        dataSet.setColors(ColorTemplate.PASTEL_COLORS);
        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(30f);
        pieChart.setHoleRadius(30f);
        Description description = new Description();
        description.setText("");
        pieChart.setDescription(description);

        //data.setValueTextSize(26f);
        data.setValueTextColor(Color.WHITE);
        int colorBlack = Color.parseColor("#000000");
        pieChart.setEntryLabelColor(colorBlack);
        pieChart.setEntryLabelTextSize(13f);
        dataSet.setValueTextSize(13f);
        Legend legend = pieChart.getLegend();
        legend.setTextSize(15f);

    }
}
