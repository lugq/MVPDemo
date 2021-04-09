package com.lugq.mvpdemo.activity;

import com.lugq.mvpdemo.LoginPresenter;
import com.lugq.mvpdemo.LoginView;
import com.lugq.mvpdemo.R;
import com.lugq.mvpdemo.java.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginView {

    @Override
    protected LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    protected int provideContentViewId() {
        return R.layout.activity_login;
    }

    @Override
    public void login() {

    }

    @Override
    public void showUserInfo() {

    }

    @Override
    public void initListener() {
        super.initListener();
        mPresenter.getUserInfo();
    }

}