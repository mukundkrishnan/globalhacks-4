package com.mkyong.controller.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonAutoDetect
public class RequestDTO {
    private String id;

    @JsonProperty(value = "account_id")
    private Integer account_id;

    @JsonProperty(value = "app_id")
    private Integer app_id;

    @JsonProperty(value = "ld_url")
    private String url;

    @JsonProperty(value = "login_token")
    private String token;

    @JsonProperty(value = "args")
    private List<ArgsDTO> argsList;

    public List<ArgsDTO> getArgsList() {
        return argsList;
    }

    public void setArgsList(List<ArgsDTO> argsList) {
        this.argsList = argsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public int getApp_id() {
        return app_id;
    }

    public void setApp_id(Integer app_id) {
        this.app_id = app_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
