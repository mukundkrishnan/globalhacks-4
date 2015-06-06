package com.mkyong.controller.dto;

/**
 * Created by Sirius on 6/6/15.
 */
public class RequestDTO {
    private String id;
    private int account_id;
    private int app_id;
    private String id_url;
    private String login_token;
    private Object args[];

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(int app_id) {
        this.app_id = app_id;
    }

    public String getId_url() {
        return id_url;
    }

    public void setId_url(String id_url) {
        this.id_url = id_url;
    }

    public String getLogin_token() {
        return login_token;
    }

    public void setLogin_token(String login_token) {
        this.login_token = login_token;
    }

    public Object[] getArgs() {
        return args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }
}
