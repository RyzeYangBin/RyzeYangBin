package com.yangbin.mybase.base;

/**
 * <pre>
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public interface IModel {
    /**
     * ViewModel销毁时清除Model，与ViewModel共消亡。Model层同样不能持有长生命周期对象
     */
    void onCleared();
}
