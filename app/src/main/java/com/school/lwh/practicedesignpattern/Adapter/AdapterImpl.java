package com.school.lwh.practicedesignpattern.Adapter;

public class AdapterImpl implements Adapter{
    @Override
    public Float twiceOf(Float f){return f*2;}

    @Override
    public Float halfOf(Float f) {return f/2;}
}
