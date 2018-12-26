package com.example.libone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.libbase2.RouterPath;

@Route(path = RouterPath.ROUTER_LOGIN)
public class OneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        int getId= getIntent().getIntExtra("id",0);
        Toast.makeText(this,getId + "",Toast.LENGTH_SHORT).show();
    }
}
