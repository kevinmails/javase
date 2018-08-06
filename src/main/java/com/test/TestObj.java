package com.test;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by KEVIN on 2016/4/5.
 */
public class TestObj implements Serializable{


    private BigDecimal dec;

    public BigDecimal getDec() {
        return dec;
    }

    public void setDec(BigDecimal dec) {
        this.dec = dec;
    }
}
