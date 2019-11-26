package com.yangbin.wanandroid.data.source;

import com.yangbin.mybase.http.BaseResponse;

import io.reactivex.Observable;

public interface HttpDataSource {
    //模拟登录
    Observable<Object> login();

    //模拟上拉加载
    Observable<DemoEntity> loadMore();

    Observable<BaseResponse<DemoEntity>> demoGet();

    Observable<BaseResponse<DemoEntity>> demoPost(String catalog);


}
