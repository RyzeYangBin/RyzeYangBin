package com.yangbin.mybase.binding.viewadapter.viewgroup;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */

import android.databinding.ViewDataBinding;

public interface IBindingItemViewModel<V extends ViewDataBinding> {
    void injecDataBinding(V binding);
}
