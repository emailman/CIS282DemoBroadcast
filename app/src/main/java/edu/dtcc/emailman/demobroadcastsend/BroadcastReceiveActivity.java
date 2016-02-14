package edu.dtcc.emailman.demobroadcastsend;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BroadcastReceiveActivity extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String actionName = intent.getAction();
        if (actionName != null &&
                actionName.equals("edu.dtcc.emailman.testingbroadcast")) {
            String msg = intent.getStringExtra("MyMessage");
            Log.d("Eric", msg);
        }
    }
}
