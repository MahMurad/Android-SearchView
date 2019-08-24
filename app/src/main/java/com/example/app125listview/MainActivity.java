package com.example.app125listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private ListView listView;
     private String[] countryNames;
     private int[] countryFlags ={R.drawable.america,R.drawable.bangladesh,R.drawable.canada
                  ,R.drawable.denmark,R.drawable.england,R.drawable.france,R.drawable.germany
                  ,R.drawable.hongkong,R.drawable.iceland,R.drawable.japan,R.drawable.korea};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListViewId);

        countryNames = getResources().getStringArray(R.array.listItem);

        //ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,R.layout.adapter_layout,R.id.textView1Id,countryNames);
        CustomAdapter adapter = new CustomAdapter(this,countryNames,countryFlags);
        listView.setAdapter(adapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,position+1+"."+countryNames[position],Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

}
