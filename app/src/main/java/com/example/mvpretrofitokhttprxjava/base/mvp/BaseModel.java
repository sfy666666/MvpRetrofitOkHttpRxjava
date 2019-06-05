package com.example.mvpretrofitokhttprxjava.base.mvp;

import java.io.Serializable;

/**
 * created by JonSnow
 * on 2019/5/31
 */
public class BaseModel<T> implements Serializable {
    public String getResaon() {
        return resaon;
    }

    public void setResaon(String resaon) {
        this.resaon = resaon;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    /*private String msg;
        private int code;
        private T data;

        public BaseModel(String message, int code) {
            this.msg = message;
            this.code = code;
        }

        public int getErrcode() {
            return code;
        }

        public void setErrcode(int code) {
            this.code = code;
        }

        public String getErrmsg() {
            return msg;
        }

        public void setErrmsg(String message) {
            this.msg = message;
        }

        public T getData() {
            return data;
        }

        public void setData(T result) {
            this.data = result;
        }

        @Override
        public String toString() {
            return "BaseModel{" +
                    "code=" + code +
                    ", msg='" + msg + '\'' +
                    ", result=" + data +
                    '}';
        }*/
    private int error_code;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    private  String resaon;


    public T result;

    public BaseModel(String message, int code) {
        this.resaon = message;
        this.error_code = code;
    }
    @Override
    public String toString() {
        return "BaseModel{"+
                "reason="+resaon+"\n"+
                ",result="+result+"}";
    }
}
