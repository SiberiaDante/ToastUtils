package com.siberiadante.toastutils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;

/**
 * Created by SiberiaDante on 2017/5/17.
 */

public class ToastApp {
    @SuppressLint("StaticFieldLeak")
    public static Context context;

    public ToastApp() {
        throw new UnsupportedOperationException("not init ToastUtils");
    }

    public static void initToastUtils(Context context) {
        ToastApp.context = context;
    }

    public static Context getContext() {
        if (context != null) {
            return context;
        } else {
            throw new NullPointerException("ToastUtils NullPointerException,you should init before");
        }
    }
}
