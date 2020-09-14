package network.algorithm.demo.dp;

import com.alibaba.fastjson.JSONObject;
import network.algorithm.demo.dfs.PalindromeCom;

/**
 * @program: AlgorithmDemo
 * @description:
 * @author: Rongjin Zhang
 * @create: 2020-09-12 16:49
 */
public class MaxWater {

    public int maxArea(int[] height) {
        int l = height.length;
        int[] dp = new int[l+1];
        for(int i = 1;i<=l;i++){
            for(int j = i+1;j<=l;j++){
                dp[i] = Math.max(Math.max(dp[i-1],Math.abs(j-i)*Math.min(height[j-1],height[i-1])),dp[i]);
                System.out.println("i:"+i+",j:"+j+",dp[i]:"+dp[i]);
            }
        }
        return dp[l-1];
    }

    public int maxArea2(int[] height) {
        if(height.length <= 1) return -1;
        int i = 0, j = height.length - 1, res = 0;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            res = Math.max(res, h * (j - i));
            System.out.println("i:"+i+",j:"+j+",dp[i]:"+res);
            if(height[i] < height[j]) ++i;
            else --j;
        }
        return res;
    }

    public static void main(String[] args) {
        MaxWater maxWater = new MaxWater();
        int[] input = new int[]{2,3,4,5,18,17,6};
        System.out.println(maxWater.maxArea2(input));
    }
}
