package com.example.studentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ClassManage extends AppCompatActivity {
     private ListView lt_manager;
    private List<String> datas;
    private AdapterView parent;
    private String data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_manage);
        lt_manager = findViewById(R.id.usmanager);

        initData();
        final ArrayAdapter adapter = new ArrayAdapter<>(
                ClassManage.this,

                android.R.layout.simple_list_item_1,
                datas);

        lt_manager.setAdapter(adapter);
       lt_manager.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(ClassManage.this, UserHelp.class);
                startActivity(intent);
            }
        });
    }
    private void initData() {
        datas.add("安卓应用程序开发");
        datas.add("移动应用程序测试");
        datas.add( "高等数学" );
        datas.add( "高职英语" );
        datas.add( "Java程序设计语言" );
        datas.add( "Android游戏开发" );
        datas.add( "心理健康" );
        datas.add( "体育" );
    }
}
