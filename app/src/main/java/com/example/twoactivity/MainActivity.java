package com.example.twoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtMesssage;
    private Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         txtMesssage = findViewById(R.id.txtMessage);
         btnSend = findViewById(R.id.btnSend);
    }

    public void onClickSend(View view) {
        String msg = txtMesssage.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("data",msg);
        startActivity(intent);
    }
}