package network.algorithm.demo.sort;

/**
 * @program: AlgorithmDemo
 * @description: 冒泡排序
 * @author: Rongjin Zhang
 * @create: 2020-08-13 16:37
 */
public class BubbleSort extends BaseSort{

    public int[] sort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    this.swap(arr,i,j);
                }
            }
        }
        return arr;
    }


}
