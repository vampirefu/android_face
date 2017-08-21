package com.haircut.wwf.haircutdesigner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 88b13942cbda223a45b84bdd0e886a993fb54b3f
=======
=======
>>>>>>> parent of 88b1394... test upload
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
<<<<<<< HEAD
>>>>>>> parent of 88b1394... test upload
=======
>>>>>>> parent of 88b1394... test upload
    }

    void MaleClick(View v){}

    void FemaleClick(View v){}
}
