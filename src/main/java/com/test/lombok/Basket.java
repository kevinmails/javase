package com.test.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

/**
 * @author kevin.chen
 * Date 2023/5/30
 * Time 09:03
 */
@Builder
public class Basket {


    @Singular("addF")
    List<String> f;
}
