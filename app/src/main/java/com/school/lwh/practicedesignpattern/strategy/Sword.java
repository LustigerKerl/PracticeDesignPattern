package com.school.lwh.practicedesignpattern.strategy;

import android.util.Log;

public class Sword implements Weapon{
    @Override
    public void attack() {
        System.out.println("검 공격");
        Log.d("attack","검 공격");
    }
}
