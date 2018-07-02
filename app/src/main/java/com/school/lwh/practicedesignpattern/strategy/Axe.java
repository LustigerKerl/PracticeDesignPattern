package com.school.lwh.practicedesignpattern.strategy;

import android.util.Log;

public class Axe implements Weapon{
    @Override
    public void attack() {
        System.out.println("도끼 공격");
        Log.d("attack","도끼 공격");
    }
}
