package com.example.mvpretrofitokhttprxjava.base;

/**
 * 异常处理类
 *
 * created by JonSnow
 * on 2019/5/31
 */
public class ApiException extends RuntimeException {
    private int errorCode;

    public ApiException(int code, String msg) {
        super(msg);
        this.errorCode = code;
    }

    public int getErrorCode() {
        return errorCode;
    }

}
