package com.yangbin.mybase.binding.viewadapter.webview;

import android.databinding.BindingAdapter;
import android.text.TextUtils;
import android.webkit.WebView;

/**
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 */
public class ViewAdapter {
    @BindingAdapter({"render"})
    public static void loadHtml(WebView webView, final String html) {
        if (!TextUtils.isEmpty(html)) {
            webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
        }
    }
}
