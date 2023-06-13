package com.test.lombok;

import lombok.Builder;
import lombok.experimental.SuperBuilder;

/**
 * @author kevin.chen
 * Date 2023/5/30
 * Time 08:39
 */
@SuperBuilder
public class Apple extends Fruit{
    private String color;

}
