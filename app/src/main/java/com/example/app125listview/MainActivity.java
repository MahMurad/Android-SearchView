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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListViewId);

        final String[] listArray = getResources().getStringArray(R.array.listItem);


        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, R.layout.adapter_layout, R.id.textViewId, listArray);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

}
