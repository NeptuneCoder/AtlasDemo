package com.yiba.atlas.demo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loadRemoteBundle = findViewById(R.id.loadRemoteBundle);

        loadRemoteBundle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClassName(MainActivity.this, "atlas.yiba.com.remotebundle.RemoteMainActivity");
                startActivity(intent);

            }
        });

    }
}
