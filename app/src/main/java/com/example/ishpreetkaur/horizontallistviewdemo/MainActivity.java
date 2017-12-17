package com.example.ishpreetkaur.horizontallistviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list);

        final ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("ArrayList List Item 1");
        arrayList.add("ArrayList List Item 2");
        arrayList.add("ArrayList List Item 3");
        arrayList.add("ArrayList List Item 4");
        arrayList.add("ArrayList List Item 5");
        arrayList.add("ArrayList List Item 6");
        arrayList.add("ArrayList List Item 7");
        arrayList.add("ArrayList List Item 8");
        arrayList.add("ArrayList List Item 9");
        arrayList.add("ArrayList List Item 10");
        arrayList.add("ArrayList List Item 11");
        arrayList.add("ArrayList List Item 12");
        arrayList.add("ArrayList List Item 13");
        arrayList.add("ArrayList List Item 14");
        arrayList.add("ArrayList List Item 15");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "" + arrayList.get(position),Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
