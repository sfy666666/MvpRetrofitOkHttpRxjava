package com.example.mvpretrofitokhttprxjava.base;

/**
 * 状态划分基类
 * created by JonSnow
 * on 2019/5/31
 */
public class BaseResult {
    public String message;
    public int code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
