package com.school.lwh.practicedesignpattern.factoryMethod.concrete;

import com.school.lwh.practicedesignpattern.factoryMethod.framework.Item;

public class MpPotion implements Item{
    @Override
    public void use() {
        System.out.println("마나 회복!");
    }
}
