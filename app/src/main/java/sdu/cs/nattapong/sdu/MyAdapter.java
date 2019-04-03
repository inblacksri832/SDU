package sdu.cs.nattapong.sdu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    //Explicit
    Context context;
    int[] ints;//ตัวแปรเก็บรูป Logo
    String[]titelString, detailString; //titelString เก็บชื่อ Logo, detaString เก็บรายละเอียด Logo

    public MyAdapter(Context context, int[] ints, String[] titelString, String[] detailString) {
        this.context = context;
        this.ints = ints;
        this.titelString = titelString;
        this.detailString = detailString;
    }

    @Override
    public int getCount() { //นับจำนวนข้อมูลที่ต้องการแสดงผลแล้วส่งไปยัง method getView
        return ints.length;
    }

    @Override
    public Object getItem(int position) { //ไม่ได้ใช้
        return null;
    }

    @Override
    public long getItemId(int position) { //ไม่ได้ใช้
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) { //นำข้อมูลที่ได้จาก method getCout ไปแสดงผลบนหน้า App

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false); // inflate เป้นการดึงค่าจาก Xml มาแสดงผลบน App

        //ผูกตัวแปรบน Jave กับ Xml
        ImageView iconImageView = view1.findViewById(R.id.imageView);
        //TextView titelTextView = view1.findViewById(R.id.textView2);
        //TextView detailTextView = view1.findViewById(R.id.textView3);

        // show View นำข้อมูลไปแสดงผลบน App
        iconImageView.setImageResource(ints[i]);
        //titelTextView.setText(titelString[i]);
        //detailTextView.setText(detailString[i]);

        return view1;
    }
}//end Class

