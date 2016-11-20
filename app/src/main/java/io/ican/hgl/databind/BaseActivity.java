package io.ican.hgl.databind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.ican.hgl.databind.databinding.ActivityBaseBinding;
import io.ican.hgl.databind.eventhandle.LaunchEventBinding;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBaseBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_base);
        LaunchEventBinding listener = new LaunchEventBinding(this);
        binding.setListener(listener);
    }
}
