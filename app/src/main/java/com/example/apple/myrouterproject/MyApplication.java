package com.example.apple.myrouterproject;

import android.app.Application;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Create by libo
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ARouter.openDebug();
        ARouter.openLog();
        ARouter.init(this);
    }
}
