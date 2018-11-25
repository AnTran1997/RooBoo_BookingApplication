package com.meu.an.rooboo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DangPhong5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_phong5);

        //Setup spinner for fields: City, District, Type of room
        Spinner spinner_thanhpho = findViewById(R.id.dangphong5_spinner_thanhpho);
        ArrayAdapter<String> thanhphoAdapter = new ArrayAdapter<String>(DangPhong5.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.spinnner_datphong5_thanhpho_items));
        thanhphoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_thanhpho.setAdapter(thanhphoAdapter);

        Spinner spinner_quan = findViewById(R.id.dangphong5_spinner_quan);
        ArrayAdapter<String> quanAdapter = new ArrayAdapter<String>(DangPhong5.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.spinnner_datphong5_quan_items));
        quanAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_quan.setAdapter(quanAdapter);

        Spinner spinner_loaiphong = findViewById(R.id.dangphong5_spinner_loaiphong);
        ArrayAdapter<String> loaiPhongAdapter = new ArrayAdapter<String>(DangPhong5.this,
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.spinnner_datphong5_loaiphong_items));
        loaiPhongAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_loaiphong.setAdapter(loaiPhongAdapter);
    }
}
