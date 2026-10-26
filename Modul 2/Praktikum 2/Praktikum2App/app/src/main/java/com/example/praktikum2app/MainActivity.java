package com.example.praktikum2app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        GridView gridview = (GridView) findViewById(R.id.grid_view);

        //Instance of ImageAdapter Class
        gridview.setAdapter(new ImageAdapter(this));
    }
}
