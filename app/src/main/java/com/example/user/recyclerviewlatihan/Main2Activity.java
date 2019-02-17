package com.example.user.recyclerviewlatihan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

     private TextView txNama , txNpm , txKelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txNama = (TextView)findViewById(R.id.nama);
        txKelas = (TextView)findViewById(R.id.kelas);
        txNpm = (TextView)findViewById(R.id.npm);
        txNama.setText(getIntent().getStringExtra("nama"));
        txNpm.setText(getIntent().getStringExtra("npm"));
        txKelas.setText(getIntent().getStringExtra("kelas"));

    }
}
