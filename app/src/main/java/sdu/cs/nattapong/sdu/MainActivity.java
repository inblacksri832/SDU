package sdu.cs.nattapong.sdu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] titleStrings, detailStrings, subStrings;
    int[] ints = new int[]{R.drawable.icon_01 , R.drawable.icon_02 ,R.drawable.icon_03 , R.drawable.icon_04 ,R.drawable.icon_05 ,
            R.drawable.icon_06 ,R.drawable.icon_07 ,R.drawable.icon_08 ,R.drawable.icon_09


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView icon1 = findViewById(R.id.imv1);
        ImageView icon2 = findViewById(R.id.imv2);
        icon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, A.class);
                startActivity(intent);
            }
            MyAdapter myAdapter = new MyAdapter(MainActivity.this,ints,titleStrings,subStrings);
        listView.setAdapter(myAdapter);

            //ทำการเชื่อมแต่ละรายการใน listview ให้ลิงค์ไปหน้า detail
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                    Intent detailIntent = new Intent(MainActivity.this, Detail.class);
                    detailIntent.putExtra("Title", titleStrings[i]);
                    detailIntent.putExtra("Detail", detailStrings[i]);
                    detailIntent.putExtra("Logo", ints[i]);
                    startActivity(detailIntent);
        });
    }
}
