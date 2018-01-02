package com.akashdubey.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public int[] image={R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ice_cream_sandwitch, R.drawable.jellybean,R.drawable.kitkat, R.drawable.lollipop};
    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView)findViewById(R.id.gridview1);


        ImageAdapter adapter=new ImageAdapter();
        gv.setAdapter(adapter);
    }

    public class ImageAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view= getLayoutInflater().inflate(R.layout.imageview,null);
            ImageView img=(ImageView)view.findViewById(R.id.imageview1);
            img.setImageResource(image[i]);
            return view;
        }
    }


}
