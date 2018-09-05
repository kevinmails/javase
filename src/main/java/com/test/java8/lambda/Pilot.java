package com.test.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @author 陈彬
 * Date 2018/8/6
 * Time 13:32
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pilot {

    private String name;





    public void introduce(Airplane action) {
        action.fly(name);
    }

}
