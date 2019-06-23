package com.sar.user.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE_KEY = "message_key";
    public static String[] songs={"Dil Dil Pakistan","Afreen Afreen","Jazba-e-Janoon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String song : songs) {
                    Intent intent = new Intent(MainActivity.this, MyIntentService.class);
                    intent.putExtra(MESSAGE_KEY,song );
                    startService(intent);

                }
            }
        });
    }
}
