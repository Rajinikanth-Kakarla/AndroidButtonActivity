package com.example.buttonact;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public void OnClickButton(View view){
        // for developers
        Log.i("button","Button Clicked");
        EditText name = findViewById(R.id.nameEditText);
        Log.i("Name",name.getText().toString());
        EditText pass = findViewById(R.id.editPassword);
        Log.i("pass",pass.getText().toString());
        // users
        Toast.makeText(MainActivity.this,"Hello"+name.getText().toString(),Toast.LENGTH_SHORT).show();
        // snackbar
        // Snackbar.make(view,"hey! this is snackbar", Snackbar.LENGTH_SHORT).show();
        // restore & delete
        Snackbar.make(view,"Message deleted", Snackbar.LENGTH_SHORT).setAction("UNDO",new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                        Snackbar.make(view,"Message Restored", Snackbar.LENGTH_SHORT).show();
            }
        }).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}