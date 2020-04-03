package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class luasTrapesium extends AppCompatActivity {
    EditText editS1, editS2, editS3;
    Button hitung;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);
        editS1 = (EditText)findViewById(R.id.editSisiT);
        editS2 = (EditText)findViewById(R.id.editSisi1);
        editS3 = (EditText)findViewById(R.id.editSisi2);
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
        double tinggi = Integer.parseInt(editS1.getText().toString());
        double sisi1 = Integer.parseInt(editS2.getText().toString());
        double sisi2 = Integer.parseInt(editS3.getText().toString());
        double yaitu = 0.5 * (sisi1 + sisi2) * tinggi;
        hasil.setText("Luas Trapesium dengan tinggi: "+ tinggi + "\n" + "sisi DC: " + sisi1 + "\n" + "sisi AB: " + sisi2 + "\n" + " adalah " +yaitu);
    }
}
