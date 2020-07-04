package com.yks.phoenix.vo;

/**
 * Created by guoyichao on 20-6-10.
 */
public class Result {

    boolean status;
    String message;

    public Result(boolean status, String message) {
        this.status = status;
        this.message = message;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
