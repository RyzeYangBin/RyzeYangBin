package com.yangbin.mybase.http.interceptor.logging;


import java.util.logging.Level;

import okhttp3.internal.platform.Platform;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */
class I {

    protected I() {
        throw new UnsupportedOperationException();
    }

    static void log(int type, String tag, String msg) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(tag);
        switch (type) {
            case Platform.INFO:
                logger.log(Level.INFO, msg);
                break;
            default:
                logger.log(Level.WARNING, msg);
                break;
        }
    }
}
