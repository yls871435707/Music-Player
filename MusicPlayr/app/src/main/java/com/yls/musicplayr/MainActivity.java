package com.yls.musicplayr;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    ListView listView;
    ImageView imageView;
    TextView musicname;
    TextView musicpeople;
    RadioButton up;
    RadioButton strat;
    RadioButton down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_homepage);
        listView = (ListView) findViewById(R.id.listview);
        imageView = (ImageView) findViewById(R.id.iv_img);
        musicname = (TextView) findViewById(R.id.tv_musicname);
        musicpeople = (TextView) findViewById(R.id.tv_musicpeople);
        up = (RadioButton) findViewById(R.id.rb_up);
        strat = (RadioButton) findViewById(R.id.rb_start);
        down = (RadioButton) findViewById(R.id.rb_down);


        up.setOnClickListener(this);
        strat.setOnClickListener(this);
        down.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rb_up:
                break;
            case R.id.rb_down:
                break;
            case R.id.rb_start:
                break;
        }
    }
}
