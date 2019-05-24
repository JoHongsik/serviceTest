package com.example.servicetest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class OnLock_BroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            Toast.makeText(context, "Screen On", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            Toast.makeText(context, "Screen Off", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context, "BOOT Completed", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(context,OnLock_Service.class);
            context.startService(i);
        }
    }
}
