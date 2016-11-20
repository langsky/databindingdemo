package io.ican.hgl.databind.setter;

import android.util.Log;
import android.view.View;

/**
 * Created by swd1 on 16-11-20.
 * custom listener setters
 */

public class CustomLayoutStateChangeListenerImpl {

    private static final String TAG = "LSChangeListenerImpl";

    public static class DetachWindow implements CustomLayoutStateChangeListener.OnViewDetachedFromWindow {
        @Override
        public void onViewDetachedFromWindow(View v) {
            Log.i(TAG, "onViewDetachFromWindow");
        }
    }

    public static class AttachWindow implements CustomLayoutStateChangeListener.OnViewAttachedToWindow {

        @Override
        public void onViewAttachedToWindow(View v) {
            Log.i(TAG, "onViewAttachToWindow");
        }
    }
}
