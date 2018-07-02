package com.school.lwh.practicedesignpattern.templateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/패스워드 확인");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return -1;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        return info;
    }
}
