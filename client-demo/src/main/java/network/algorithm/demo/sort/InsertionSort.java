package network.algorithm.demo.sort;

/**
 * @program: AlgorithmDemo
 * @description: 冒泡排序
 * @author: Rongjin Zhang
 * @create: 2020-08-13 16:37
 */
public class InsertionSort extends BaseSort{

    public int[] sort(int[] arr){
        int current = arr[0];
        int preIndex = 0;
        for(int i = 1;i<arr.length;i++){
            preIndex = i-1;
            current = arr[i];
            while (preIndex >= 0 && arr[preIndex] > current){
                arr[preIndex + 1] = arr[preIndex ];
                preIndex --;
            }
            arr[preIndex+1] = current;
        }
        return arr;
    }


}
