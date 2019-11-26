package com.yangbin.mybase.http;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */

public class ResponseThrowable extends Exception {
    public int code;
    public String message;

    public ResponseThrowable(Throwable throwable, int code) {
        super(throwable);
        this.code = code;
    }
}
