package com.chan.testapplication;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;
import com.bumptech.glide.request.target.Target;

public class SplashActivity extends Activity {

    class C02831 extends Handler {
        C02831() {
        }

        public void handleMessage(Message msg) {
            SplashActivity.this.overridePendingTransition(C0273R.anim.fadein, C0273R.anim.fadeout);
            SplashActivity.this.finish();
        }
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(C0273R.layout.splash);
        Glide.with((Activity) this).load(Integer.valueOf(C0273R.raw.load)).into((Target) new GlideDrawableImageViewTarget((ImageView) findViewById(C0273R.id.iv1)));
        new C02831().sendEmptyMessageDelayed(0, 3000);
    }

    public void onBackPressed() {
    }
}
