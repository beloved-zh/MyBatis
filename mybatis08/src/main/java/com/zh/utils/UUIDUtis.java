package com.zh.utils;

import org.junit.Test;

import java.util.UUID;

public class UUIDUtis {

    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test(){
        System.out.println(UUIDUtis.getUUID());
    }

}
