package network.algorithm.demo.dfs;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @program: AlgorithmDemo
 * @description: leetCode 39
 * @author: Rongjin Zhang
 * @create: 2020-09-09 14:47
 */
public class CombinedSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> rs = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(rs,path,k,n,1);
        return rs;
    }

    public void dfs(List<List<Integer>> rs,Deque<Integer> path,int k,int n, int index){
        if(n == 0 && path.size() == k) rs.add(new ArrayList<>(path));
        if(n -index< 0 ) return;
        if(index > 9) return;
        for(int i = index;i<n+index;i++){
            path.addLast(i);
            System.out.println("put index:"+index+",put i:"+i+",put n:"+n);
            dfs(rs,path,k,n-i,i+1);
            System.out.println("out index:"+index+",out i:"+i);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        CombinedSum3 addCount = new CombinedSum3();
        System.out.println(JSONObject.toJSONString(addCount.combinationSum3(3, 9)));
    }
}
