package com.linfix.dto;

public class ResponseDto<T> {
    public interface RESPONSE{
        String SUCCESS_CODE = "200";
        String FAIL_CODE = "201";
        String SUCCESS_MESSAGE = "业务处理成功";
    }
    private String code;//200 success
    private String message;
    private Object data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 构建带数据的响应
     * @param data
     * @return
     */
    public static ResponseDto successWithData(Object data){
        return new ResponseDto(RESPONSE.SUCCESS_CODE,RESPONSE.SUCCESS_MESSAGE,data);
    }

    /**
     * 构建失败 传入错误信息的响应
     * @param message
     * @return
     */
    public static ResponseDto failWithMessage(String message){
        return new ResponseDto(RESPONSE.FAIL_CODE,message,null);
    }
    public ResponseDto(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
