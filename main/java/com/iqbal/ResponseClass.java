package com.iqbal;

public class ResponseClass {
    private String body;
    private Integer statusCode = 200;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public ResponseClass(String greetings) {
        this.body = greetings;
    }

    public ResponseClass() {
    }

}

