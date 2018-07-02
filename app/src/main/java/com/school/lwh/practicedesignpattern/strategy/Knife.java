package com.school.lwh.practicedesignpattern.strategy;

import android.util.Log;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("칼 공격");
        Log.d("attack","칼 공격");
    }
}
