package com.example.kazukiyasui.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //OKボタン
        Button bt_ok = findViewById(R.id.button_ok);
        bt_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            //OKボタンクリックイベント
            public void onClick(View view) {
                EditText et_input = findViewById(R.id.et_Input);
                TextView tv_output = findViewById(R.id.tv_Output);
                String txt = et_input.getText().toString();
                tv_output.setText(txt);
            }
        });

        //「1」ボタンのクリックリスナーセット
        Button btn_green = findViewById(R.id.btn_Green);
        btn_green.setOnClickListener(this);

        //「2」ボタンのクリックリスナーセット
        Button btn_blue = findViewById(R.id.btn_Blue);
        btn_blue.setOnClickListener(this);

        //「3」ボタンのクリックリスナーセット
        Button btn_red = findViewById(R.id.btn_Red);
        btn_red.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        ImageView iv_droid = findViewById(R.id.iv_droid);

        switch (view.getId()){
            case R.id.btn_Green:
                iv_droid.setImageResource(R.drawable.android_logo);
                break;
            case R.id.btn_Blue:
                iv_droid.setImageResource(R.drawable.android_logo_blue);
                break;
            case R.id.btn_Red:
                iv_droid.setImageResource(R.drawable.android_logo_red);
                break;
        }
    }

//    class OkButtonClickListener implements View.OnClickListener
//    {
//
//        @Override
//        public void onClick(View view)
//        {
//            EditText et_input = findViewById(R.id.et_Input);
//            TextView tv_output = findViewById(R.id.tv_Output);
//            String txt = et_input.getText().toString();
//            tv_output.setText(txt);
//        }
//    }
}
