package network.algorithm.demo.sort;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @program: AlgorithmDemo
 * @description: 运行类
 * @author: Rongjin Zhang
 * @create: 2020-08-13 16:46
 */
@Slf4j
public class SortMain {

    public static void main(String[] args) {
        int[] arr = new int[]{50,48,3,15,4,44,69,54,16,25,33,45};

//        BaseSort baseSort = new BubbleSort();

        BaseSort baseSort = new MergeSort();


        int[] ret = baseSort.sort(arr);
        log.info("data:{}", JSONObject.toJSONString(ret));
    }
}
