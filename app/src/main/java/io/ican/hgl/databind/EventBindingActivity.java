package io.ican.hgl.databind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.ican.hgl.databind.databinding.ContactItem;
import io.ican.hgl.databind.eventhandle.CustomEventBinding;
import io.ican.hgl.databind.datahandle.View;
import io.ican.hgl.databind.eventhandle.CustomMotionEvent;
import io.ican.hgl.databind.eventhandle.CustomListenerBinding;


public class EventBindingActivity extends AppCompatActivity {
    //Test data binding and event binding
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ContactItem binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_event);
        binding.setHandler(new CustomListenerBinding());
        binding.setEvent(new CustomMotionEvent());
        binding.setListener(new CustomEventBinding());

        view = new View();
        view.setVisible(true);
        view.setError(true);
        view.setBackground(0xffff00ff);
        binding.setCustomView(view);
    }

}
