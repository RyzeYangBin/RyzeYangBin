package com.yangbin.mybase.binding.viewadapter.swiperefresh;

import android.databinding.BindingAdapter;
import android.support.v4.widget.SwipeRefreshLayout;

import com.yangbin.mybase.binding.command.BindingCommand;



/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */
public class ViewAdapter {
    //下拉刷新命令
    @BindingAdapter({"onRefreshCommand"})
    public static void onRefreshCommand(SwipeRefreshLayout swipeRefreshLayout, final BindingCommand onRefreshCommand) {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (onRefreshCommand != null) {
                    onRefreshCommand.execute();
                }
            }
        });
    }

    //是否刷新中
    @BindingAdapter({"refreshing"})
    public static void setRefreshing(SwipeRefreshLayout swipeRefreshLayout, boolean refreshing) {
        swipeRefreshLayout.setRefreshing(refreshing);
    }

}
