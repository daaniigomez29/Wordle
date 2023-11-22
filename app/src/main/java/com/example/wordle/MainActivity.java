package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public EditText crearEditText(){
        EditText editText = new EditText(this);
        editText.setLayoutParams(new GridLayout.LayoutParams());
        editText.setTextAppearance(this, R.style.editText);
        return editText;
    }
}