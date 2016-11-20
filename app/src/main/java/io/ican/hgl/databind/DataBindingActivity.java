package io.ican.hgl.databind;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.ican.hgl.databind.databinding.ActivityBindingDataBinding;
import io.ican.hgl.databind.observable.CustomBaseObservable;
import io.ican.hgl.databind.setter.CustomLayoutStateChangeListener;
import io.ican.hgl.databind.setter.CustomLayoutStateChangeListenerImpl;
import io.ican.hgl.databind.observable.CustomObservableField;

public class DataBindingActivity extends AppCompatActivity {

    //test BaseObservable, ObservableField, ObservableArrayMap
    CustomBaseObservable user;
    CustomObservableField user2;
    ObservableArrayMap<String, String> user3;
    //test custom listener setters
    CustomLayoutStateChangeListener.OnViewDetachedFromWindow detach;
    CustomLayoutStateChangeListener.OnViewAttachedToWindow attach;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBindingDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_binding_data);
        user = new CustomBaseObservable();
        user2 = new CustomObservableField();
        user3 = new ObservableArrayMap<>();

        detach = new CustomLayoutStateChangeListenerImpl.DetachWindow();
        attach = new CustomLayoutStateChangeListenerImpl.AttachWindow();

        binding.changeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setFirstName("firstName " + i);
                user.setLastName("lastName " + i);
                i++;
            }
        });

        binding.changeName2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user2.firstName.set("firstName " + i);
                user2.lastName.set("lastName " + i);
                i++;
            }
        });
        binding.changeName3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user3.put("firstName", "firstName " + i);
                user3.put("lastName", "lastName " + i);
                i++;
            }
        });

        binding.setUser(user);
        binding.setUser2(user2);
        binding.setUser3(user3);

        binding.setAttach(attach);
        binding.setDetach(detach);
    }
}
