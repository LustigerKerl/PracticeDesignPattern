package com.school.lwh.practicedesignpattern.strategy;

import android.util.Log;

public class GameCharacter {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(){
        if(weapon==null){
            System.out.println("맨손 공격");
            Log.d("attack","맨손 공격");
        }
        else{
            weapon.attack();
        }
    }
}
