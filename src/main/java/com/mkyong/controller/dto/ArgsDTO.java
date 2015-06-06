package com.mkyong.controller.dto;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

import java.io.Serializable;

/**
 * Created by Sirius on 6/6/15.
 */
@JsonAutoDetect
public class ArgsDTO implements Serializable{

	private static final long serialVersionUID = 4146573053792856476L;

	@JsonProperty(value = "id")
    private Integer integer;

    @JsonProperty(value = "op")
    private String param;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
