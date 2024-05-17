package com.test.ulid;

import io.azam.ulidj.MonotonicULID;
import io.azam.ulidj.ULID;

/**
 * @author kevin.chen
 * Date 2024/5/17
 * Time 23:05
 */
public class ULIDUtil {

    private static final MonotonicULID instance = new MonotonicULID();
    private ULIDUtil(){

    }

    public static String monotonicULID(){
        return instance.generate();
    }

    public static String ulid(){
        return ULID.random();
    }





}
