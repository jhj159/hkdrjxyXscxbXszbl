package com.hkd.Pojo;

import org.springframework.stereotype.Component;

/**
 * @author jhj
 * @data 2021/8/6 - 20:55
 */
@Component
public class RetMessage {
    private String ret_code;

    public String getRet_code() {
        return ret_code;
    }

    public void setRet_code(String ret_code) {
        this.ret_code = ret_code;
    }
}
