package com.lugq.mvpdemo;

import android.support.v4.app.Fragment;

/**
 * 对应印象笔记文章： BaseFragment 封装
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends BaseFragment<LoginPresenter> implements LoginView {

    @Override
    public void login() {

    }

    @Override
    public void showUserInfo() {

    }

    @Override
    protected LoginPresenter createPresenter() {
        return null;
    }

    @Override
    protected int provideContentViewId() {
        return 0;
    }

    @Override
    protected void loadData() {

    }
}
