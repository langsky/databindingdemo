package io.ican.hgl.databind.eventhandle;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by swd1 on 16-11-19.
 * custom touch click longClick handles. event binding.
 */

public class CustomEventBinding {

    private static final String TAG = "EventBindingListener";

    public boolean onLongClickHandle(CustomMotionEvent event) {
        Log.i(TAG, "onLongClick");
        return true;
    }

    public boolean onClickHandle(int id) {
        Log.i(TAG, "onClick");
        return true;
    }

    public boolean onTouchHandle(View view, MotionEvent event) {
        Log.i(TAG, "onTouch event " + MotionEvent.actionToString(event.getAction()));
        return false;
    }

}
