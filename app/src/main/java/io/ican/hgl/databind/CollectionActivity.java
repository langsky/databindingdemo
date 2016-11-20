package io.ican.hgl.databind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;

import io.ican.hgl.databind.databinding.ActivityCollectionBinding;
import io.ican.hgl.databind.datahandle.View;

public class CollectionActivity extends AppCompatActivity {

    //test List & Map
    HashMap<String, View> hashMap;
    ArrayList<View> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollectionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_collection);
        list = new ArrayList<>();
        hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            View view = new View();
            view.setBackground(0xff345678 >>> i);
            view.setVisible(true);
            view.setName("NAME " + i);
            list.add(view);
            hashMap.put(view.getName(), view);
        }

        binding.setIndex(3);
        binding.setStringIndex("NAME 1");
        binding.setViewList(list);
        binding.setViewMap(hashMap);
    }
}
