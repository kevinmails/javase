package com.test.math;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.apache.commons.math3.random.Well19937c;

/**
 * 生成一个满足正态分布且在指定区间内的随机整数。
 */
public class NormalRandomGenerator {

    /**
     * 生成满足正态分布且在指定区间内的随机整数。
     *
     * @param mean 均值
     * @param standardDeviation 标准差
     * @param lowerBound 下界（包含）
     * @param upperBound 上界（包含）
     * @return 满足条件的随机整数
     */
    public static int generateNormalIntInRange(int mean, int standardDeviation, int lowerBound, int upperBound) {
        // 创建正态分布对象
        NormalDistribution normalDist = new NormalDistribution(mean, standardDeviation);

        // 循环生成直到得到满足条件的整数值
        double randomNumber;
        int integerResult;
        do {
            randomNumber = normalDist.sample();
            // 将生成的浮点数四舍五入为整数
            integerResult = (int) Math.round(randomNumber);
        } while (integerResult < lowerBound || integerResult > upperBound);

        return integerResult;
    }

    /**
     * 主函数，用于测试生成的随机整数。
     */
    public static void main(String[] args) {
        int mean = 50; // 均值
        int standardDeviation = 10; // 标准差
        int lowerBound = 1; // 下界
        int upperBound = 70; // 上界

        for (int i = 0; i < 100; i++) {
            int randomInt = generateNormalIntInRange(mean, standardDeviation, lowerBound, upperBound);
            System.out.println("生成的随机整数: " + randomInt);
        }
    }
}
