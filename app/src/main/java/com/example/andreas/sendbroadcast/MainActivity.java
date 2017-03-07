package com.example.andreas.sendbroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void broadcastKnap(View v)
    {
        Intent i = new Intent("my.action.string");
        i.setAction("us.andreas.sendbroadcast");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        i.putExtra("extra", "RAW TEXT");
        sendBroadcast(i);
        Toast.makeText(this,"Sendt besked", Toast.LENGTH_LONG).show();
    }

    public void SendBroadcast(View view)
    {
        Intent i = new Intent("my.action.string");
        i.setAction("com.example.andreas.sendbroadcast");
        i.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(i);
    }
}
