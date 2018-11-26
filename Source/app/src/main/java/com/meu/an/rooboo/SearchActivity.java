package com.meu.an.rooboo;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;

public class SearchActivity extends AppCompatActivity {
    SearchView searchView;
    ListView lv;
    private Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        searchView=(SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("Nhập địa điểm. Ví dụ: Hội An...");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String s) {
               // Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                //Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();
                return false;
            }
        });

        lv=findViewById(R.id.lv);
        // địa chỉ, ảnh bìa, tên, giá tiền, số người bình luận, tiện ích 1, tiện ích 2, tiện ích 3, tiện ích 4, tiện ích 5, số tiện ích 5, tiện ích 6, số tiện ích 6)
        Room room1= new Room("01 Nguyễn Đình Chiểu, Quận 1, TP HCM",R.drawable.img_hotel3,"Forest Dream","745.000","120 người bình luận", R.drawable.ic_wifi, R.drawable.ic_refrigerator, R.drawable.ic_air_conditioner, R.drawable.ic_kitchen, R.drawable.ic_bed,"x4",R.drawable.ic_bath_tub,"x3","4.5", 4.5 );
        Room room2= new Room("18/8 Trần Hưng Đạo, Quận 1",R.drawable.img_hotel4,"Khách sạn ACB","500.000","100 người bình luận", R.drawable.ic_wifi, R.drawable.ic_air_conditioner, R.drawable.ic_kitchen, R.drawable.ic_bar, R.drawable.ic_bed,"x2",R.drawable.ic_bath_tub,"x2","4.0",4.0);
        Room room3= new Room("123 Bình Thạnh, TPHCM",R.drawable.img_hotel1,"Newdays","450.000","152 người bình luận", R.drawable.ic_wifi, R.drawable.ic_refrigerator, R.drawable.ic_bar, R.drawable.ic_air_conditioner, R.drawable.ic_bed,"x3",R.drawable.ic_bath_tub,"x3","3.9",3.9 );
        Room room4= new Room("05 Nguyễn Văn Thủ, Quận 1, TP HCM",R.drawable.img_hotel2,"Royal Hotel","350.000","231 người bình luận", R.drawable.ic_wifi, R.drawable.ic_swimmingpool, R.drawable.ic_air_conditioner, R.drawable.ic_hot_shower, R.drawable.ic_bed,"x2",R.drawable.ic_bath_tub,"x2","3.5",3.5 );
        Room room5= new Room("235 Nguyễn Văn Cừ, Quận 5, TP HCM",R.drawable.img_hotel3,"Hello man","250.000","80 người bình luận", R.drawable.ic_wifi, R.drawable.ic_hot_shower, R.drawable.ic_air_conditioner, R.drawable.ic_bar, R.drawable.ic_bed,"x2",R.drawable.ic_bath_tub,"x1","3.4",3.4 );

        ArrayList<Room> listRoom= new ArrayList<>();
        listRoom.add(room1);
        listRoom.add(room2);
        listRoom.add(room3);
        listRoom.add(room4);
        listRoom.add(room5);


        mAdapter = new Adapter(this, R.layout.cardview,listRoom);
        lv.setAdapter(mAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String txtbane = view.findViewById(R.id.txtNameHotel).toString();
                Toast.makeText(SearchActivity.this, "asd", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
