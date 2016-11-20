package io.ican.hgl.databind.setter;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;

/**
 * Created by swd1 on 16-11-20.
 * custom LayoutStateChangeListener which has two methods, so we need divide it to two parts.
 */

public interface CustomLayoutStateChangeListener {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    interface OnViewDetachedFromWindow {
        void onViewDetachedFromWindow(View v);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    interface OnViewAttachedToWindow {
        void onViewAttachedToWindow(View v);
    }
}
