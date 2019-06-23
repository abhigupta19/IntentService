package com.sar.user.intent;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {
   

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        String a=intent.getStringExtra(MainActivity.MESSAGE_KEY);
        download(a);

    }

    private void download(String a) {
        try {
            Thread.sleep(4000);
            Log.d("hiik",a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}