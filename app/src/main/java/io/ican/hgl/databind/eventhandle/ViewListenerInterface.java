package io.ican.hgl.databind.eventhandle;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by swd1 on 16-11-19.
 * some interfaces of View.
 */

public interface ViewListenerInterface {

    boolean onLongClickHandle(View view);

    void onClickHandle(View view);

    boolean onTouchHandle(View view, MotionEvent event);
}
