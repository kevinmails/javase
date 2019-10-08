package com.test.bitmap;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author kevin
 */
public class BitMapTest {
    public static void main(String[] args) {

        int[] arry = new int[]{3,8,2,4,8,7,20,16};
        BitMapTest  bitMap= new BitMapTest();

        bitMap.bitMapSort(arry);


    }


    public void bitMapSort(int[] arr){


        byte[] bits = new byte[this.getIndex(20) + 1 ];

        Arrays.stream(arr).forEach((a)-> {

            this.add(bits, a);
        });

        for (int i = 0; i < 21; i++) {
            if (this.contains(bits,i)){
                System.out.println(i);
            }
        }


    }


    /**
     * num/8得到byte[]的index
     * @param num
     * @return
     */
    public int getIndex(int num){
        return num >> 3;
    }

    /**
     * 判断指定数字num是否存在<br/>
     * 将1左移position后，那个位置自然就是1，然后和以前的数据做&，判断是否为0即可
     * @param bits
     * @param num
     * @return
     */
    public boolean contains(byte[] bits, int num){
        return (bits[getIndex(num)] & 1 << getPosition(num)) != 0;
    }


    /**
     * num%8得到在byte[index]的位置
     * @param num
     * @return
     */
    public int getPosition(int num){
        return num & 0x07;
    }


    /**
     * 标记指定数字（num）在bitmap中的值，标记其已经出现过
     * 将1左移position后，那个位置自然就是1，然后和以前的数据做|，这样，那个位置就替换成1了
     * @param bits
     * @param num
     */
    public void add(byte[] bits, int num){
        bits[getIndex(num)] |= 1 << getPosition(num);
    }

}
