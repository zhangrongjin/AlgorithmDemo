package network.algorithm.demo.sort;

/**
 * @program: AlgorithmDemo
 * @description: 冒泡排序
 * @author: Rongjin Zhang
 * @create: 2020-08-13 16:37
 */
public class ShellSort extends BaseSort{

    public int[] sort(int[] arr){
        int length = arr.length;
        for(int i = (int) Math.floor(length/2); i>0; i = (int) Math.floor(i/2)){
            for(int j = i;j<length;j++){
                int x=j;
                int current = arr[j];
                while (x-i>=0 && current<arr[x-i]){
                    arr[x] = arr[x-i];
                    x = x-i;
                }
                arr[x] = current;
            }
        }
        return arr;
    }


}
