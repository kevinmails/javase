package com.test.java8.lambda;

import lombok.Builder;

/**
 * @author 陈彬
 * Date 2018/8/6
 * Time 13:32
 */
@Builder
public class Pilot {

    private String name;





    public void introduce(Airplane airplane) {


        airplane.fly(name);
    }

}
