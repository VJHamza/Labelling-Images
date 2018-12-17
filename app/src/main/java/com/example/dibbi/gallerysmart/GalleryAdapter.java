package com.example.dibbi.gallerysmart;

import android.content.Context;
import android.widget.BaseAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.GridView;

import static android.widget.GridLayout.*;

public class GalleryAdapter extends BaseAdapter {
    private Context context;

    public Integer[] image={
            R.drawable.baby,
            R.drawable.hamza,
            R.drawable.download,
            R.drawable.ima,
            R.drawable.download1,
            R.drawable.download2,
            R.drawable.download3
    };

    public GalleryAdapter(Context c){
        context=c;
    }


    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return image[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(image[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView    ;
    }
}
