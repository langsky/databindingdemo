package io.ican.hgl.databind.eventhandle;

import android.content.Context;
import android.content.Intent;


/**
 * Created by swd1 on 16-11-20. launch activities.
 */

public class LaunchEventBinding extends CustomEventBinding {

    public static final int LAUNCH_BASIC_TEST_ACTIVITY = 1;
    public static final int LAUNCH_COLLECTION_TEST_ACTIVITY = 2;
    public static final int LAUNCH_DATA_BINDING_TEST_ACTIVITY = 3;

    private Context context;

    public LaunchEventBinding(Context context) {
        this.context = context;
    }

    @Override
    public boolean onClickHandle(int id) {

        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        switch (id) {
            case LAUNCH_BASIC_TEST_ACTIVITY:
                intent.setAction("action.basic.test");
                break;
            case LAUNCH_COLLECTION_TEST_ACTIVITY:
                intent.setAction("action.collection.test");
                break;
            case LAUNCH_DATA_BINDING_TEST_ACTIVITY:
                intent.setAction("action.data.binding.test");
                break;
            default:
            case 0:
                return false;
        }
        context.startActivity(intent);
        return true;
    }
}
