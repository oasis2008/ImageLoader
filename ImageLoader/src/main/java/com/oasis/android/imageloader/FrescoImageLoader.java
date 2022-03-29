package com.oasis.android.imageloader;

import android.content.Context;

import java.util.concurrent.atomic.AtomicBoolean;

public class FrescoImageLoader {

    private static AtomicBoolean sInit = new AtomicBoolean(false);

    public static void init(Context context) {

        if (context == null) throw new IllegalStateException("context can not be null!!!");

        if (sInit.compareAndSet(false, true)) {
            //TODO
        }
    }

    public static boolean isInit() {
        return sInit.get();
    }

}
