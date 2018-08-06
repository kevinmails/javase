package com.test.optimisticlocking;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 陈彬
 *         Date 2017/11/26
 *         Time 16:06
 */
public class Test {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10, 30, TimeUnit.SECONDS, new LinkedBlockingDeque(1));

        for (int i = 0; i < 2; i++) {
            executor.execute(() -> {
                UserAsset userAsset = new UserAsset();
                userAsset = userAsset.getAssert(1);
                System.out.println(Thread.currentThread().getName()+ "得到用户资产:"+userAsset.getAsset());
                if (BigDecimal.ZERO.compareTo(userAsset.getAsset()) < 0) {
                    userAsset.setAsset(userAsset.getAsset().subtract(new BigDecimal(60.69).setScale(2, RoundingMode.HALF_DOWN)));
                     boolean isSusses= userAsset.updateUserAssert(userAsset);
                    System.out.println(Thread.currentThread().getName()+ "更新用户资产:"+isSusses);
                }

            });

        }


    }
}
