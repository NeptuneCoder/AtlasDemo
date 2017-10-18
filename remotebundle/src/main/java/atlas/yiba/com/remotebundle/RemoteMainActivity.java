package atlas.yiba.com.remotebundle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RemoteMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_main);
        Button startSencond = findViewById(R.id.startSencond);
        startSencond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RemoteMainActivity.this,SencondActivity.class);
                startActivity(intent);
            }
        });
    }
}
