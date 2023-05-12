package com.example.shopping_platform.vo;

public class ActiveResponse {
    private String message ;
//=============================================================================

    public ActiveResponse(String message) {
        this.message = message;
    }

    public ActiveResponse() {
    }

    //=============================================================================
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
