package com.chan.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class QuestionActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        setContentView(C0273R.layout.activity_question);
    }

    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 4) {
            return false;
        }
        return true;
    }

    public void onBackPressed() {
    }

    public void mOnClose(View v) {
        finish();
    }
}
