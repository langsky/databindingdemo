package io.ican.hgl.databind.setter;

import android.databinding.BindingAdapter;
import android.widget.TextView;
import android.view.View;


/**
 * Created by swd1 on 16-11-20. custom Setters.
 *
 */

public class CustomSetterUtil {

    //all "android:text" attr will be changed !
    @BindingAdapter({"android:text"})
    public static void setCustomText(TextView view, String oldValue) {
        view.setText(String.format("%s has changed", oldValue));
    }

    //use "app:text" to implement it. other "app:text" from unknown class will be ignored.
    @BindingAdapter({"bind:text"})
    public static void setCustomBindText(TextView view, String oldValue) {
        view.setText(String.format("%s has changed twice.", oldValue));
    }


    /**
     * set a custom layoutStateChangeListener, there must be three methods.
     * note i use android namespace, not app.
     */

    @BindingAdapter("android:onViewDetachedFromWindow")
    public static void setListener(View v, CustomLayoutStateChangeListener.OnViewDetachedFromWindow detach) {
        setListener(v, null, detach);
    }

    @BindingAdapter("android:onViewAttachedToWindow")
    public static void setListener(View v, CustomLayoutStateChangeListener.OnViewAttachedToWindow attach) {
        setListener(v, attach, null);
    }

    @BindingAdapter({"android:onViewAttachedToWindow", "android:onViewDetachedFromWindow"})
    public static void setListener(View v, final CustomLayoutStateChangeListener.OnViewAttachedToWindow attach, final CustomLayoutStateChangeListener.OnViewDetachedFromWindow detach) {
        View.OnAttachStateChangeListener l
                = new View.OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View v) {
                if (attach != null)
                    attach.onViewAttachedToWindow(v);
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
                if (detach != null)
                    detach.onViewDetachedFromWindow(v);

            }
        };
        v.addOnAttachStateChangeListener(l);
    }
}
