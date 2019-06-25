package com.lugq.mvpdemo;

/**
 * @Description
 * @Author Lu Guoqiang
 * @Time 2019/6/25 20:43
 */
public interface BaseView<T> {
    void setPresenter(T presenter);
}
