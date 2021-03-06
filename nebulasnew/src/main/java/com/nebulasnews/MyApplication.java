package com.nebulasnews;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import android.support.multidex.MultiDex;

import com.nebulas.io.account.ApplicationInstance;

/**
 * Created by nebulas on 2018/5/9.
 */

public class MyApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
        ApplicationInstance.instance = this;

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
