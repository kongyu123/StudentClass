package com.example.studentclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnlog,btnex;
    private EditText eduser,edpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlog=findViewById(R.id.login);
        btnex=findViewById(R.id.exit);
        edpass=findViewById(R.id.password);
        eduser=findViewById(R.id.username);

        btnlog.setOnClickListener(this);
        btnex.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login:
                String username = eduser.getText().toString();
                String password = edpass.getText().toString();


                if (username.equals("kong")&&password.equals("123")){
                    Intent intent = new Intent(MainActivity.this,first.class);

                    intent.putExtra("id",eduser.getText().toString());
                    startActivityForResult(intent,100);
                }
                else{
                    Toast.makeText(this,"用户名或密码为空",Toast.LENGTH_SHORT);
                }
                break;
            case R.id.exit:
                break;
        }
    }
}
