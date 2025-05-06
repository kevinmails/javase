package com.test.generic.gen2;

import java.util.Collections;
import java.util.List;

/**
 * @author kevin.chen
 * Date 2024/8/1
 * Time 23:04
 */
public class Show {


    public static <T extends Animal> void showSkill(T ani) {

        ani.canRun();


    }
}
