package com.example.mvpretrofitokhttprxjava.activity;

import com.example.mvpretrofitokhttprxjava.base.mvp.BaseModel;
import com.example.mvpretrofitokhttprxjava.base.mvp.BaseView;

import java.util.List;

/**
 * created by JonSnow
 * on 2019/5/31
 */
public interface MainView extends BaseView {
    void onMainSuccess(BaseModel<MainBean> o);
}
