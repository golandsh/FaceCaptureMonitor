package com.danel.hours.facecapturemonitor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegistrationActivity extends Activity {

    private TextView mHelloView;
    private Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mHelloView = (TextView)findViewById(R.id.hello_guest);
        mHelloView.setText(mHelloView.getText() + " שלומי");

        btnEnter = (Button) findViewById(R.id.btn_enter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CameraScannerActivity.class);
                startActivity(intent);
            }
        });
    }
}
