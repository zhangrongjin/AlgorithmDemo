package network.algorithm.demo.dfs;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @program: AlgorithmDemo
 * @description: leetCode 39
 * @author: Rongjin Zhang
 * @create: 2020-09-09 14:47
 */
public class CombinedSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> rs = new ArrayList<>();
        if(candidates.length == 0){
            return rs;
        }
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(rs,path,candidates,0,target);
        return rs;
    }

    public void dfs(List<List<Integer>> rs, Deque<Integer> path,int[] candidates, int index , int target){
        if(target == 0){
            System.out.println("----------------------------");
            rs.add(new ArrayList<>(path));
        }
        if(target - candidates[index] < 0){
            return ;
        }
        for(int i=index; i<candidates.length;i++){
            path.addLast(candidates[i]);
            System.out.println("i:" + i + ",target"+target +",c:"+candidates[i]);
            dfs(rs,path,candidates,i,target-candidates[i]);
            int r = path.removeLast();
            System.out.println("i:" + i + ",remove:"+ r);
        }

    }

    public static void main(String[] args) {
        int[] input = new int[]{8,7,4,3};
        CombinedSum addCount = new CombinedSum();
        System.out.println(JSONObject.toJSONString(addCount.combinationSum(input, 7)));
    }
}
