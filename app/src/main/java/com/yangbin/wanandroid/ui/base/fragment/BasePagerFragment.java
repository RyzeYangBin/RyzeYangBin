package com.yangbin.wanandroid.ui.base.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.yangbin.mybase.base.BaseFragment;
import com.yangbin.mybase.base.BaseViewModel;
import com.yangbin.wanandroid.R;
import com.yangbin.wanandroid.databinding.FragmentBasePagerBinding;
import com.yangbin.wanandroid.ui.base.adapter.BaseFragmentPagerAdapter;

import java.util.List;

/**
 * <pre>
 *     author : yangbin
 *     e-mail : 99154650@qq.com
 *     time   : 2019/11/22
 *     desc   :抽取的二级BasePagerFragment
 *     version: 1.0
 * </pre>
 */
public abstract class BasePagerFragment extends BaseFragment<FragmentBasePagerBinding, BaseViewModel> {

    private List<Fragment> mFragments;
    private List<String> titlePager;

    protected abstract List<Fragment> pagerFragment();

    protected abstract List<String> pagerTitleString();

    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.fragment_base_pager;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        mFragments = pagerFragment();
        titlePager = pagerTitleString();
        //设置Adapter
        BaseFragmentPagerAdapter pagerAdapter = new BaseFragmentPagerAdapter(getChildFragmentManager(), mFragments, titlePager);
        binding.viewPager.setAdapter(pagerAdapter);
        binding.tabs.setupWithViewPager(binding.viewPager);
        binding.viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(binding.tabs));
    }

    @Override
    public void initViewObservable() {

    }
}

