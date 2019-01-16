package com.example.nodream.learnandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class TouchEventActivity extends AppCompatActivity {
    private RelativeLayout mLayout;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_touch_event);

        mLayout = (RelativeLayout) this.findViewById(R.id.touch_event_rl);
//        mLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("TouchEventActivity", "OnClickListener--onClick--"+v);
//            }
//        });
        mLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("TouchEventActivity", "OnTouchListener--onTouch-- action="+event.getAction()+" --"+v);
                return false;
            }
        });
        mButton = (Button) this.findViewById(R.id.touch_event_btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TouchEventActivity", "OnClickListener--onClick--"+v);
            }
        });
        mButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("TouchEventActivity", "OnTouchListener--onTouch-- action="+event.getAction()+" --"+v);
                return true;
            }
        });

    }
}
