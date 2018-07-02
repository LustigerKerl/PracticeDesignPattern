package com.school.lwh.practicedesignpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.school.lwh.practicedesignpattern.Adapter.Adapter;
import com.school.lwh.practicedesignpattern.Adapter.AdapterImpl;
import com.school.lwh.practicedesignpattern.strategy.Axe;
import com.school.lwh.practicedesignpattern.strategy.GameCharacter;
import com.school.lwh.practicedesignpattern.strategy.Knife;
import com.school.lwh.practicedesignpattern.strategy.Sword;
import com.school.lwh.practicedesignpattern.templatemethod.AbstGameConnectHelper;
import com.school.lwh.practicedesignpattern.templatemethod.DefaultGameConnectHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.button);
        Button btn2=findViewById(R.id.button2);
        Button btn3=findViewById(R.id.button3);
        Button btn4=findViewById(R.id.button4);
        Button btn5=findViewById(R.id.button5);
        Button btn6=findViewById(R.id.button6);

        final GameCharacter gameCharacter=new GameCharacter();
        final Adapter adapter=new AdapterImpl();
        final DefaultGameConnectHelper helper=new DefaultGameConnectHelper();
        gameCharacter.attack();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameCharacter.setWeapon(new Knife());
                gameCharacter.attack();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameCharacter.setWeapon(new Sword());
                gameCharacter.attack();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameCharacter.setWeapon(new Axe());
                gameCharacter.attack();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameCharacter.setWeapon(null);
                gameCharacter.attack();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, Float.toString(adapter.halfOf(100f)), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, Float.toString(adapter.twiceOf(100f)), Toast.LENGTH_SHORT).show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.requestConnection("아이디 암호 등 접속 정보");
            }
        });
    }
}
