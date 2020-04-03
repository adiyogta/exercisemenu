package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class kelilingTrapesium extends AppCompatActivity {
    EditText editS1, editS2, editS3, editS4;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);
        editS1 = (EditText)findViewById(R.id.editSisi3);
        editS2 = (EditText)findViewById(R.id.editSisi1);
        editS3 = (EditText)findViewById(R.id.editSisi2);
        editS4 = (EditText)findViewById(R.id.editSisi4);
        hitung = (Button)findViewById(R.id.btnHitung);
        hasil = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editS1.getText().toString().isEmpty()||editS2.getText().toString().isEmpty()||editS3.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "Tidak Boleh Ada Yang Kosong",Toast.LENGTH_SHORT).show();
                } else {
                    hitung();
                }
            }
        });
    }
    private void hitung() {
        double sisi3 = Integer.parseInt(editS1.getText().toString());
        double sisi1 = Integer.parseInt(editS2.getText().toString());
        double sisi2 = Integer.parseInt(editS3.getText().toString());
        double sisi4 = Integer.parseInt(editS4.getText().toString());
        double yaitu =  sisi1 + sisi2 + sisi3 + sisi4;
        hasil.setText("Keliling Trapesium dengan AD: "+ sisi3 + "\n" +"sisi DC: " + sisi1 + "\n" + "sisi AB: " + sisi2 + "\n" + "sisi BC : "+sisi4 + "\n" + " adalah " +yaitu);

    }
}
