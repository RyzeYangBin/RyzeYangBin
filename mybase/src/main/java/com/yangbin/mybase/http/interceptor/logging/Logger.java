package com.yangbin.mybase.http.interceptor.logging;

import okhttp3.internal.platform.Platform;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public interface Logger {
    void log(int level, String tag, String msg);

    Logger DEFAULT = new Logger() {
        @Override
        public void log(int level, String tag, String message) {
            Platform.get().log(level, message, null);
        }
    };
}
