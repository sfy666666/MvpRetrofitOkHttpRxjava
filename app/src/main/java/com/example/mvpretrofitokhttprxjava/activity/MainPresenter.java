package com.example.mvpretrofitokhttprxjava.activity;

import com.example.mvpretrofitokhttprxjava.base.mvp.BaseModel;
import com.example.mvpretrofitokhttprxjava.base.mvp.BaseObserver;
import com.example.mvpretrofitokhttprxjava.base.mvp.BasePresenter;

import java.util.List;

/**
 * created by JonSnow
 * on 2019/5/31
 */
public class MainPresenter extends BasePresenter<MainView> {
    public MainPresenter(MainView baseView) {
        super(baseView);
    }

    public void commentAdd() {
        addDisposable(apiServer.getMain("beijing","f464c53cb02240a194640685ee425116"), new BaseObserver(baseView) {
            @Override
            public void onSuccess(Object o) {
                baseView.onMainSuccess((BaseModel<List<MainBean>>) o);
            }

            @Override
            public void onError(String msg) {
                if (baseView != null) {
                    baseView.showError(msg);
                }
            }
        });
    }
}
