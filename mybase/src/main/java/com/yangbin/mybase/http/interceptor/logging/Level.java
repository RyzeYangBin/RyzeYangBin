package com.yangbin.mybase.http.interceptor.logging;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */

public enum Level {
    /**
     * No logs.
     */
    NONE,
    /**
     * <p>Example:
     * <pre>{@code
     *  - URL
     *  - Method
     *  - Headers
     *  - Body
     * }</pre>
     */
    BASIC,
    /**
     * <p>Example:
     * <pre>{@code
     *  - URL
     *  - Method
     *  - Headers
     * }</pre>
     */
    HEADERS,
    /**
     * <p>Example:
     * <pre>{@code
     *  - URL
     *  - Method
     *  - Body
     * }</pre>
     */
    BODY
}
