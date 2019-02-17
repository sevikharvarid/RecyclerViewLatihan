package com.example.user.recyclerviewlatihan;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {

    private ArrayList<DataMahasiswa> dataList;
    private Context context;

    public MahasiswaAdapter(ArrayList<DataMahasiswa> dataList, Context context) {
        this.dataList = dataList;
        this.context = context;

    }

    @NonNull
    @Override
    public MahasiswaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MahasiswaAdapter.MahasiswaViewHolder mahasiswaViewHolder, final int i) {
        mahasiswaViewHolder.txNama.setText(dataList.get(i).getNama());
        mahasiswaViewHolder.txNpm.setText(dataList.get(i).getNpm());
        mahasiswaViewHolder.txKelas.setText(dataList.get(i).getKelas());

        mahasiswaViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, dataList.get(i).getNama(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, Main2Activity.class);
                intent.putExtra("nama", dataList.get(i).getNama());
                intent.putExtra("npm", dataList.get(i).getNpm());
                intent.putExtra("kelas", dataList.get(i).getKelas());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {
        private TextView txNama, txNpm, txKelas;
        private CardView cardView;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.cardview);
            txNama = (TextView) itemView.findViewById(R.id.txt_nama_mahasiswa);
            txNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            txKelas = (TextView) itemView.findViewById(R.id.txt_kelas_mahasiswa);
        }
    }
}
