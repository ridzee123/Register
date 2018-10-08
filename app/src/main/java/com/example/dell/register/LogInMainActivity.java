package com.example.dell.register;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogInMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_main);
    }
    public void signupOrLogin(View v){
        switch (v.getId()){
            case R.id.login_btn_login :{
                break;
            }
            case R.id.signup_login :{
                break;
            }
        }
    }
}
