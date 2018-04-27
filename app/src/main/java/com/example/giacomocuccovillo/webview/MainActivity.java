package com.example.giacomocuccovillo.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bottone = (Button) findViewById(R.id.button);
        bottone.setOnClickListener(buttonListener);
        testo = (TextView) findViewById(R.id.textView);


    }

public View.OnClickListener buttonListener = new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        testo.setText("ENRICO GAY");
    }
};

}
