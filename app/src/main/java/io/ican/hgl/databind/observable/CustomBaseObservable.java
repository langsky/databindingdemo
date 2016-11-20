package io.ican.hgl.databind.observable;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import io.ican.hgl.databind.BR;

/**
 * Created by swd1 on 16-11-20. a class extends BaseObservable
 */

public class CustomBaseObservable extends BaseObservable {

    private String firstName;

    private String lastName;

    //be careful, don't forget @Bindable
    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        //just notify the variable "user"
        notifyPropertyChanged(BR.user);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        //notify all variables !
        notifyChange();
    }
}
