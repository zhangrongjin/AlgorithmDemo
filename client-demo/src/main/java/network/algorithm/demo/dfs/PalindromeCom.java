package network.algorithm.demo.dfs;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @program: AlgorithmDemo
 * @description: leetCode 131
 * @author: Rongjin Zhang
 * @create: 2020-09-09 15:20
 */
public class PalindromeCom {
    public List<List<String>> partition(String s) {
        List<List<String>> rs = new ArrayList<>();
        if(s.length() == 0){
            return rs;
        }
        Deque<String> path = new ArrayDeque<>();
        dfs(rs,path,s,0);
        return rs;
    }
    public void dfs(List<List<String>> rs, Deque<String> path, String s, int index ){
        if(index == s.length() ){
            rs.add(new ArrayList(path));
            return;
        }
        for(int i = index;i<s.length();i++){
            if(!checkPalindrome(s, index, i)){
                continue;
            }
            System.out.println("index:"+index +",i:"+i);
            path.addLast(s.substring(index,i+1));
            dfs(rs,path,s,i+1);
            path.removeLast();
        }
    }
    private boolean checkPalindrome(String str, int left, int right) {
        // 严格小于即可
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCom stringData = new PalindromeCom();
        System.out.println(JSONObject.toJSONString(stringData.partition("aab")));
    }
}
