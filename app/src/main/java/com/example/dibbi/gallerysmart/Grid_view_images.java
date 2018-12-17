package com.example.dibbi.gallerysmart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Grid_view_images extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_images);
        GridView gridView=(GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new GalleryAdapter(Grid_view_images.this) );
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getApplicationContext(),full_image.class);
                i.putExtra("id",position);
                startActivity(i);
            }
        });
    }
}
