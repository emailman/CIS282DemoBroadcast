package edu.dtcc.emailman.demobroadcastsend;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BroadcastSendMainActivity extends AppCompatActivity {
    public static String BROADCAST_STRING = "edu.dtcc.emailman.testingbroadcast";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_send_main);

        Button broadcastButton =
                (Button) this.findViewById(R.id.broadcast_button);
        broadcastButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v) {
                Intent broadcastIntent = new Intent();
                broadcastIntent.putExtra
                        ("MyMessage", "Time for you to do your own thing!");
                broadcastIntent.setAction(BROADCAST_STRING);
                sendBroadcast(broadcastIntent);
                Log.d("Eric", "requested intent");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_broadcast_send_main, menu);
        return true;
    }
}
