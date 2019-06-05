package com.example.mvpretrofitokhttprxjava.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpretrofitokhttprxjava.R;
import com.example.mvpretrofitokhttprxjava.base.BaseActivity;
import com.example.mvpretrofitokhttprxjava.base.mvp.BaseModel;

import java.util.List;


public class MainActivity extends BaseActivity<MainPresenter> implements MainView, View.OnClickListener {

    private TextView tv_msg;
    private Button btn;

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initToolbar(Bundle savedInstanceState) {

    }

    @Override
    protected void initData() {
        tv_msg = findViewById(R.id.tv_msg);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    @Override
    public void onMainSuccess(BaseModel<MainBean> o) {
        List<MainBean.DataBean> data = o.getResult().getData();
        MainBean.DataBean bean=data.get(0);
        tv_msg.setText(bean.getTitle());
    }

    @Override
    public void onClick(View v) {
        mPresenter.commentAdd();
    }
}
