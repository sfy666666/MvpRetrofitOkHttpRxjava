package com.example.mvpretrofitokhttprxjava.base.mvp;

/**
 * 基本回调 可自定义添加所需回调
 *
 * created by JonSnow
 * on 2019/5/31
 */
public interface BaseView {
    /**
     * 显示dialog
     */
    void showLoading();
    /**
     * 隐藏 dialog
     */

    void hideLoading();
    /**
     * 显示错误信息
     *
     * @param msg
     */
    void showError(String msg);
    /**
     * 错误码
     */
    void onErrorCode(BaseModel model);
}
