package com.fooddelivery.exception;

import java.util.Date;

public class GlobalCustomException extends Exception{

    Date date;
    String message;

    public GlobalCustomException(Date date, String message) {
        super();
        this.date = date;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
