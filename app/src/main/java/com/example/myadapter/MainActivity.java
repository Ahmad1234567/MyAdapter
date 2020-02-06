package com.example.myadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<String> list;
ArrayAdapter<String> adapter;
SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView) findViewById(R.id.lv1);
        searchView=(SearchView) findViewById(R.id.searchView);

        list= new ArrayList<> ();

        list.add("MAD");
        list.add("IS");
        list.add("CSA");
        list.add("OOP");
        list.add("DCN");
        list.add("OS");
        list.add("MAD");
        list.add("IS");
        list.add("CSA");
        list.add("OOP");
        list.add("DCN");
        list.add("OS");
        list.add("MAD");
        list.add("IS");
        list.add("CSA");
        list.add("OOP");
        list.add("DCN");
        list.add("OS");
        list.add("MAD");
        list.add("IS");
        list.add("CSA");
        list.add("OOP");
        list.add("DCN");
        list.add("OS");
        adapter= new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(list.contains(query)){

                    adapter.getFilter().filter(query);
                    }else
                    Toast.makeText(MainActivity.this, "Match Not Found",
                            Toast.LENGTH_SHORT).show();

                return false;
            }
            @Override
            public boolean onQueryTextChange(String Text) {
                return false;
            }
        });
    }
}
