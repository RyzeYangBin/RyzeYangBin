package com.yangbin.mybase.base;

import android.support.annotation.NonNull;
/**
 * <pre>
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 *     desc   :ItemViewModel
 *     version: 1.0
 * </pre>
 */

public class ItemViewModel<VM extends BaseViewModel> {
    protected VM viewModel;

    public ItemViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
    }
}
