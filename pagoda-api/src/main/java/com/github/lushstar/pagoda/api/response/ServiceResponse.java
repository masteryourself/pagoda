package com.github.lushstar.pagoda.api.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * <p>description : ServiceResponse
 *
 * <p>blog : https://blog.csdn.net/masteryourself
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2020/2/25 21:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class ServiceResponse<T> implements Serializable {

    private boolean success;
    private int code;
    private String message;
    private T data;

    public static <T> ServiceResponse<T> success(T data) {
        return success("success", data);
    }

    public static <T> ServiceResponse<T> success(String message, T data) {
        ServiceResponse<T> response = new ServiceResponse<>();
        response.setSuccess(true);
        response.setCode(200);
        response.setMessage(message);
        response.setData(data);
        return response;
    }

    public static <T> ServiceResponse<T> error(String message) {
        return error(400, message);
    }

    public static <T> ServiceResponse<T> error(int code, String message) {
        ServiceResponse<T> response = new ServiceResponse<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);
        return response;
    }

    public void log() {
        if (this.isSuccess()) {
            log.info("响应成功, {}", this.getData());
        } else {
            log.error("响应失败出错, code: {}, message:{}", this.getCode(), this.getMessage());
        }
    }

}
