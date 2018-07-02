package com.school.lwh.practicedesignpattern.templateMethod;

public abstract class AbstGameConnectHelper {
    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);

    public String requestConnection(String str) {
        doSecurity(str);
        if (!authentication("id", "pw")) {
            throw new Error("아이디 패스워드가 일치하지 않습니다!");
        }
        switch (authorization("username")) {
            case -1:
                System.out.println("셧다운 대상자이므로 프로그램을 종료합니다.");
                break;
            case 0:
                System.out.println("게임 매니저 로그인");
                break;
            case 1:
                System.out.println("유료 회원 로그인");
                break;
            case 2:
                System.out.println("무료 회원 로그인");
                break;
            case 3:
                System.out.println("권한 없음 상태 로그인");
                break;
            default:
                System.out.println("애는 뭐지??");
                break;
        }

        return connection(str);
    }
}
