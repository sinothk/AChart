package com.sinothk.chart.demo.ox.bean;


/**
 * autour : openXu
 * date : 2018/6/8 9:40
 * className : PieBean
 * version : 1.0
 * description : 请添加类说明
 */
public class PieBean {
    private float Number;
    private String Name;

    public PieBean() {
    }

    public PieBean(float Number, String Name) {
        this.Number = Number;
        this.Name = Name;
    }

    public float getNumber() {
        return Number;
    }

    public void setNumber(float number) {
        Number = number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
