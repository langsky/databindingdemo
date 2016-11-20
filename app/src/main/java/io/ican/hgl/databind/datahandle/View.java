package io.ican.hgl.databind.datahandle;

import android.databinding.BindingConversion;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;


/**
 * Created by swd1 on 16-11-19.
 */

public class View {
    private static final String TAG = "View";

    private int background;

    private boolean error;

    private boolean visible;

    private String name;

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }


    public int getBackground() {
        return background;
    }


    public void setBackground(int background) {
        this.background = background;
    }

    public boolean getError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //test @BindingConversion
    @BindingConversion
    public static ColorDrawable errorConverter(boolean error) {
        return error ? new ColorDrawable(Color.RED) : new ColorDrawable(Color.DKGRAY);
    }

    @BindingConversion
    public static int visibleToInt(boolean visible) {
        return visible ? android.view.View.VISIBLE : android.view.View.INVISIBLE;
    }

    @BindingConversion
    public static ColorDrawable bgConverter(int background) {
        return new ColorDrawable(background);
    }

    //test static methods
    public static String staticMethod() {
        return "This is a textView";
    }

}
