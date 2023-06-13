package com.test.serialization;

import java.io.Serializable;

/**
 * @author 陈彬
 *         Date 2017/8/20
 *         Time 17:30
 */

@FunctionalInterface
public interface Human extends Serializable {

    void sayHello();
}
