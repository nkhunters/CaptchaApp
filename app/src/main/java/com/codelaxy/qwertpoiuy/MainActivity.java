package com.codelaxy.qwertpoiuy;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startLogin();
    }

    private void startLogin() {

        startActivity(new Intent(MainActivity.this, Login.class));
    }
}
