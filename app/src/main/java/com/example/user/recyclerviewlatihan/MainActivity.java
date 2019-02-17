package com.example.user.recyclerviewlatihan;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<DataMahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        addData();

        adapter = new MahasiswaAdapter(mahasiswaArrayList,getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }


    void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new DataMahasiswa("Sephikhar Varid", "26116912", "3KB06"));
        mahasiswaArrayList.add(new DataMahasiswa("Varid", "45116912", "3KB07"));
        mahasiswaArrayList.add(new DataMahasiswa("Vikhar", "26132912", "3KB08"));
        mahasiswaArrayList.add(new DataMahasiswa("Varid Vikhar", "65112912", "3KB09"));
        mahasiswaArrayList.add(new DataMahasiswa("Sephikhar", "36126916", "3KB10"));
    }
}
