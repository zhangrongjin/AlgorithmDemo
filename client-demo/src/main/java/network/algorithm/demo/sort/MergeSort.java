package network.algorithm.demo.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: AlgorithmDemo
 * @description: 冒泡排序
 * @author: Rongjin Zhang
 * @create: 2020-08-13 16:37
 */
public class MergeSort extends BaseSort{

    public int[] sort(int[] arr){
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int middle = (int) Math.floor(len / 2);
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr,middle, len);
        return merge(sort(left), sort(right));
    }


    private int[] merge(int[] left,int[] right){
        int s = 0;
        int[] result =  new int[left.length + right.length];
        while (left.length>0 && right.length>0) {
            if (left[0] <= right[0]) {
                result[s++] = left[0];
                left = Arrays.copyOfRange(left,1, left.length);
            } else {
                result[s++] = right[0];
                right = Arrays.copyOfRange(right,1, right.length);
            }
        }
        while (left.length > 0){
            result[s++] = left[0];
            left = Arrays.copyOfRange(left,1, left.length);
        }
        while (right.length > 0){
            result[s++] = right[0];
            right = Arrays.copyOfRange(right,1, right.length);
        }
        return result;
    }
}
