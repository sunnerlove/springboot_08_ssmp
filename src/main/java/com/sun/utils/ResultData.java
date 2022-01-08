package com.sun.utils;

import lombok.Data;

/*这是一个封装的返回给前端的类*/
@Data
public class ResultData {
    private Boolean flag ;
    private Object data;
    public ResultData(){
    }
    public ResultData(Boolean flag){
        this.flag = flag;
    }
    public ResultData(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }
}
