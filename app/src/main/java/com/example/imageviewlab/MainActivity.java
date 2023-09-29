package com.example.imageviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;
    ArrayList<imageModel>images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager=(ViewPager2) findViewById(R.id.viewPager);
        images=new ArrayList<>();
        imageModel model1=new imageModel(R.drawable.one, "One","This is first");
        images.add(model1);
        imageModel model2=new imageModel(R.drawable.two,"Two","This is second");
        images.add(model2);
        imageModel model3=new imageModel(R.drawable.three,"Three","This is three");
        images.add(model3);

        viewPager.setAdapter(new imageAdaptor(images));
    }
}