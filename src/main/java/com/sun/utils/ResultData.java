package com.sun.utils;

import lombok.Data;

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
