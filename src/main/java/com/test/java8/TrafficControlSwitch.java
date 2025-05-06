package com.test.java8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TrafficControlSwitch {

    final ThreadLocalRandom random =ThreadLocalRandom.current();

    /**
     * 根据给定的比率返回 true 或 false。
     *
     * @param ratio 比率，范围是 0.0 到 1.0，例如 0.2 表示 20% 的概率返回 true。
     * @return 根据比率随机返回 true 或 false。
     */
    public boolean shouldAllow(double ratio) {
        if (ratio < 0.0 || ratio > 1.0) {
            throw new IllegalArgumentException("Ratio must be between 0.0 and 1.0");
        }
        return random.nextDouble() < ratio;
    }

    public static void main(String[] args) {
        TrafficControlSwitch switcher = new TrafficControlSwitch();
        double ratio = 0.2;
        int totalCalls = 20000;
        int allowedCount = 0;

        for (int i = 0; i < totalCalls; i++) {
            if (switcher.shouldAllow(ratio)) {
                allowedCount++;
            }
        }

        System.out.println("Total calls: " + totalCalls);
        System.out.println("Allowed count: " + allowedCount);
        System.out.println("Expected allowance rate: " + (ratio * 100) + "%");
        System.out.println("Actual allowance rate: " + String.format("%.2f", (allowedCount / (double) totalCalls * 100)) + "%");

        // 新增误差率计算
        double expected = ratio * 100;
        double actual = (allowedCount / (double) totalCalls) * 100;
        double errorRate = Math.abs(actual - expected) / expected * 100; // 相对误差百分比
        System.out.println("误差率: " + String.format("%.2f", errorRate) + "%");
    }

}