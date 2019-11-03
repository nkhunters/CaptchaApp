package com.codelaxy.qwertpoiuy.ModelsNew;

public class User {

    private String total_earning, captcha_time, captcha_count, captcha_rate, auto_approve, message;

    public User(String total_earning, String captcha_time, String captcha_count, String captcha_rate, String auto_approve, String message) {
        this.total_earning = total_earning;
        this.captcha_time = captcha_time;
        this.captcha_count = captcha_count;
        this.captcha_rate = captcha_rate;
        this.auto_approve = auto_approve;
        this.message = message;
    }

    public String getTotal_earning() {
        return total_earning;
    }

    public String getCaptcha_time() {
        return captcha_time;
    }

    public String getCaptcha_count() {
        return captcha_count;
    }

    public String getCaptcha_rate() {
        return captcha_rate;
    }

    public String getAuto_approve() {
        return auto_approve;
    }

    public String getMessage() {
        return message;
    }
}
