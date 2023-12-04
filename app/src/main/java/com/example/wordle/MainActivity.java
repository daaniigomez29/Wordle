package com.example.wordle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String palabraOculta = "letra";
    private TextView[] letraTextViews = new TextView[5]; // TextViews para mostrar retroalimentación
    private EditText editTextEscribir;
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;
    private LinearLayout linearLayout4;
    private LinearLayout linearLayout5;

    private LinearLayout linearLayout6;
    private List<LinearLayout> intentos = new ArrayList<>();

    private Button btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextEscribir = findViewById(R.id.editTextEscribir);
        intentos.add(findViewById(R.id.linearLayout1));
        intentos.add(findViewById(R.id.linearLayout2));
        intentos.add(findViewById(R.id.linearLayout3));
        intentos.add(findViewById(R.id.linearLayout4));
        intentos.add(findViewById(R.id.linearLayout5));
        intentos.add(findViewById(R.id.linearLayout6));
        btnConfirmar = findViewById(R.id.btnConfirmar);

        letraTextViews[0] = findViewById(R.id.abc1);
        letraTextViews[1] = findViewById(R.id.abc2);
        letraTextViews[2] = findViewById(R.id.abc3);
        letraTextViews[3] = findViewById(R.id.abc4);
        letraTextViews[4] = findViewById(R.id.abc5);
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = editTextEscribir.getText().toString();
                    for (int i = 0; i < intentos.size(); i++) {
                        LinearLayout linearLayout = intentos.get(i);
                        actualizarLinearLayout(linearLayout, inputText.charAt(i));
                    }
                }
        });
    }

    private void actualizarLinearLayout(LinearLayout linearLayout, char letra) {
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View child = linearLayout.getChildAt(i);
            if (child instanceof TextView) {
                TextView textView = (TextView) child;
                textView.setText(String.valueOf(letra));
            }
        }
    }
}