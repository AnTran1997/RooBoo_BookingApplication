package com.meu.an.rooboo;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.jpeng.jptabbar.JPTabBar;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    SearchView searchView;
    ListView lv;
    JPTabBar mTabbar;
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
        Room room1= new Room("01 Nguyễn Đình Chiểu, Quận 1, TP HCM",R.drawable.img_hotel3,"Forest Dream","745.000","120 người bình luận","x3","x3" );
        Room room2= new Room("18/8 Trần Hưng Đạo, Quận 1, TP HCM",R.drawable.img_hotel4,"ACB Hotel","500.000","60 người bình luận","x2","x2" );
        Room room3= new Room("35/6 Nguyễn Cư Trinh, Quận 1, TP HCM",R.drawable.img_hotel1,"Homestay Hello","450.000","50 người bình luận","x2","x1" );
        Room room4= new Room("35/6 Nguyễn Cư Trinh, Quận 1, TP HCM",R.drawable.img_hotel1,"Homestay Hello","450.000","50 người bình luận","x2","x1" );

        ArrayList<Room> listRoom= new ArrayList<>();
        listRoom.add(room1);
        listRoom.add(room2);
        listRoom.add(room3);
        listRoom.add(room4);

        mAdapter = new Adapter(this, R.layout.cardview,listRoom);
        lv.setAdapter(mAdapter);

    }
}
