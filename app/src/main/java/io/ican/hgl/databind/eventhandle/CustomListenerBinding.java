package io.ican.hgl.databind.eventhandle;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by swd1 on 16-11-19.
 *
 */

public class CustomListenerBinding implements ViewListenerInterface {

    private static final String TAG = "CustomListenerBinding";

    public boolean onLongClickHandle(View view) {
        Log.i(TAG, "onLongClick");
        return true;
    }

    public void onClickHandle(View view) {
        Log.i(TAG, "onClick");
    }

    public boolean onTouchHandle(View view, MotionEvent event) {
        Log.i(TAG, "onTouch event " + MotionEvent.actionToString(event.getAction()));
        return false;
    }

}
