package io.ican.hgl.databind.observable;

import android.databinding.ObservableField;

/**
 * Created by swd1 on 16-11-20.
 * use ObservableField to bind data.
 */

public class CustomObservableField {
    //public final
    public final ObservableField<String> firstName =
            new ObservableField<>();
    public final ObservableField<String> lastName =
            new ObservableField<>();
}
