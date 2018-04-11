package com.qiyue.utils;

import com.qiyue.vo.Result;
import com.qiyue.vo.TableResult;


import java.util.List;

/**
 * Created by y747718944 on 2018/2/6
 * Result 返回工具
 */
public class ResultUtils {



    public static Result getResult(Object data){
        return new Result(data);
    }

    public static Result success() {
        return new Result(true);
    }
    public static Result success(String successMsg) {
        return new Result(successMsg,true);
    }
    public static Result success(String successMsg,Object data) {
            return new Result(successMsg,data);
    }
    public static Result error() {
        return new Result(false);
    }
    public static Result error(String errorMsg) {
        return new Result(errorMsg,false);
    }

    public static Result error(String errorMsg, Integer errorCode) {
        return new Result(errorMsg,errorCode);
    }


    public static TableResult getResultByPage(long total, List<Object> rows){

        return new TableResult(total,rows);
    }

}
