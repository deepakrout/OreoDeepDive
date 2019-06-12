package com.iappstogo.oreodeepdive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClickButton(View btnView){
        Log.i("Info","It Worked!");
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        EditText passwordEditTest = (EditText) findViewById(R.id.passwordEditText);
        Log.i("Info",nameEditText.getText().toString());
        Toast.makeText(this, nameEditText.getText().toString() +" "+passwordEditTest.getText().toString(), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
