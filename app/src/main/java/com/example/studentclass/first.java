package com.example.studentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;

public class first extends AppCompatActivity implements View.OnClickListener {
    private TextView t_welcome;
    private  TextView t_manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_first );
        initView();
    }

    private void initView() {
        t_welcome =findViewById( R.id.welcome );
       t_manager = findViewById( R.id.manager );
        t_manager.setOnClickListener( this );


        Intent intent  = getIntent();
        String aa= intent.getStringExtra( "id" );

        t_welcome.setText("欢迎"+ aa +"来到学生空间");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.manager:

                Intent intent = new Intent( first.this, UserHelp.class );
                startActivity( intent );

                break;

        }

    }
}
