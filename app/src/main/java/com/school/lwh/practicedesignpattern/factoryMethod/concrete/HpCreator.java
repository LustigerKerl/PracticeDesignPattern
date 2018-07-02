package com.school.lwh.practicedesignpattern.factoryMethod.concrete;

import com.school.lwh.practicedesignpattern.factoryMethod.framework.Item;
import com.school.lwh.practicedesignpattern.factoryMethod.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator{
    @Override
    protected void requestItemInfo() {
        System.out.println("데이터베이스에서 체력회복 물약의 정보를 가져옵니다");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력회복 물약을 새로 생성 하였습니다."+new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
