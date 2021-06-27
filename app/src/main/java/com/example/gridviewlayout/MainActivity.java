package com.example.gridviewlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gVFlags);

        MyAdapter myAdapter = new MyAdapter(this);
        gridView.setAdapter(myAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        ViewPlaceHolder placeHolder = (ViewPlaceHolder) view.getTag();
        OneColumn oneColumn = (OneColumn) placeHolder.imageView.getTag();

        Intent intent = new Intent(MainActivity.this,MyDialog.class);

        intent.putExtra("countryImage",oneColumn.id);
        intent.putExtra("text",oneColumn.name);

        startActivity(intent);
    }
}