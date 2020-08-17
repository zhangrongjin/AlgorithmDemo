package network.algorithm.demo.sort;

/**
 * @program: AlgorithmDemo
 * @description: 基础抽象类
 * @author: Rongjin Zhang
 * @create: 2020-08-13 16:42
 */
public abstract class BaseSort {

    public abstract int[] sort(int[] arr);

    protected void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
