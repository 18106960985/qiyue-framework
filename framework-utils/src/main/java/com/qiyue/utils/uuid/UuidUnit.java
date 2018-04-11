package com.qiyue.utils.uuid;


import java.util.UUID;


public class UuidUnit {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }


}
