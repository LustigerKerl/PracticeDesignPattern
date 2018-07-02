package com.school.lwh.practicedesignpattern.factoryMethod.concrete;

import com.school.lwh.practicedesignpattern.factoryMethod.framework.Item;

public class HpPotion implements Item{
    @Override
    public void use() {
        System.out.println("체력 회복!");
    }
}
