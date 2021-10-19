package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if("com.example.broadcastreceiver.ACTION_SEND".equals(intent.getAction())){
            String extraData = intent.getStringExtra("com.example.EXTRA_DATA");
            Toast.makeText(context, "from receiver: "+extraData, Toast.LENGTH_LONG).show();

        }

    }
}
