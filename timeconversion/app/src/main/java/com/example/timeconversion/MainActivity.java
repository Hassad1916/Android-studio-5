package com.example.timeconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(Time);
    }
    private View.OnClickListener Time = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            DecimalFormat time = new DecimalFormat("0");
            EditText A = (EditText)findViewById(R.id.editTextTextPersonName);
            EditText B = (EditText)findViewById(R.id.editTextTextPersonName2);
            EditText C = (EditText)findViewById(R.id.editTextTextPersonName3);
            EditText D = (EditText)findViewById(R.id.editTextTextPersonName4);
            EditText E = (EditText)findViewById(R.id.editTextTextPersonName5);
            EditText F = (EditText)findViewById(R.id.editTextTextPersonName6);
            int years = Integer.parseInt(A.getText().toString());
            int mouths = Integer.parseInt(B.getText().toString());
            int days = Integer.parseInt(C.getText().toString());
            int hours = Integer.parseInt(D.getText().toString());
            int minutes = Integer.parseInt(E.getText().toString());
            int secords = Integer.parseInt(F.getText().toString());

            TextView x = (TextView)findViewById(R.id.textView10);
            x.setText(time.format(years) + "/" + time.format(mouths) + "/" + time.format(days));
            //格式化輸出時/分/秒
            TextView y = (TextView)findViewById(R.id.textView11);
            y.setText(time.format(hours) + ":" + time.format(minutes) + ":" + time.format(secords));

        }
 };
}