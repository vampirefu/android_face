package com.haircut.wwf.haircutdesigner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> list = new ArrayList();
        ArrayList<String> listFilter = new ArrayList();
        list.add("abb");
        list.add("bbc");
        list.add("cdd");
        for(String i:list)
        {
            if(i.contains("a"))
                listFilter.add(i);
        }
    }
}
