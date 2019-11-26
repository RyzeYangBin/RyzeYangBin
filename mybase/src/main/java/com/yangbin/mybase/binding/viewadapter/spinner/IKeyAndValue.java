package com.yangbin.mybase.binding.viewadapter.spinner;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 *      des:下拉Spinner控件的键值对, 实现该接口,返回key,value值, 在xml绑定List<IKeyAndValue>
 */
public interface IKeyAndValue {
    String getKey();

    String getValue();
}
