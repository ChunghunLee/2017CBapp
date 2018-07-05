package com.chan.testapplication;

import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LoadingApp extends Application {
    private static LoadingApp loadingApp;
    AppCompatDialog progressDialog;

    public static LoadingApp getInstance() {
        return loadingApp;
    }

    public void onCreate() {
        super.onCreate();
        loadingApp = this;
    }

    public void progressON(Activity activity, String message) {
        if (activity != null && !activity.isFinishing()) {
            if (this.progressDialog == null || !this.progressDialog.isShowing()) {
                this.progressDialog = new AppCompatDialog(activity);
                this.progressDialog.setCancelable(false);
                this.progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                this.progressDialog.setContentView((int) C0273R.layout.progress_loading);
                this.progressDialog.show();
            } else {
                progressSET(message);
            }
            ImageView img_loading_frame = (ImageView) this.progressDialog.findViewById(C0273R.id.iv_frame_loading);
            final AnimationDrawable frameAnimation = (AnimationDrawable) img_loading_frame.getBackground();
            img_loading_frame.post(new Runnable() {
                public void run() {
                    frameAnimation.start();
                }
            });
            TextView tv_progress_message = (TextView) this.progressDialog.findViewById(C0273R.id.tv_progress_message);
            if (!TextUtils.isEmpty(message)) {
                tv_progress_message.setText(message);
            }
        }
    }

    public void progressSET(String message) {
        if (this.progressDialog != null && this.progressDialog.isShowing()) {
            TextView tv_progress_message = (TextView) this.progressDialog.findViewById(C0273R.id.tv_progress_message);
            if (!TextUtils.isEmpty(message)) {
                tv_progress_message.setText(message);
            }
        }
    }

    public void progressOFF() {
        if (this.progressDialog != null && this.progressDialog.isShowing()) {
            this.progressDialog.dismiss();
        }
    }
}
