package com.example.mytlbc.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class TimeServce extends Service {


    //服务创建
    @Override
    public void onCreate() {
        super.onCreate();
    }
    //服务启动
    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
    }
    //服务终结
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
    //隐式不管
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
