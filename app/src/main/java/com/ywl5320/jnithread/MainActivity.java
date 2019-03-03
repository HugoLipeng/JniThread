package com.ywl5320.jnithread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ThreadDemo threadDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        threadDemo = new ThreadDemo();
        threadDemo.setOnErrerListener(new ThreadDemo.OnErrerListener() {
            @Override
            public void onError(int code, String msg) {
                Log.d("ywl5320", "code = " + code + " msg = " + msg);
            }
        });
    }

    public void normal(View view) {
        threadDemo.normalThread();
    }

    public void mutexThread(View view) {
        threadDemo.mutexThread();
    }

    public void calbackThread(View view) {

        threadDemo.callbackFromC();

    }
}
