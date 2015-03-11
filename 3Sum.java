package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) 
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();//建立新的res
        if(num == null || num.length <= 2)
            return res;
        Arrays.sort(num);//先排序
        for(int i = num.length - 1; i >= 2; i--)
        //为了保证不溢出，数组是从0开始，所以i最大取值是length-1
        //因为是要保证三个数的输出，所以i大于等于2
        {
            if(i < num.length - 1 && num[i] == num[i + 1])
                continue; //skip this recurision，忽略这种情况然后继续循环，因为题目中有说要不重复的
            //get two sum which values is - num[i]
            ArrayList<ArrayList<Integer>> curRes = twoSum(num,i-1,-num[i]);//建立两个sum的，使得两个sum为num【i】
            
            for(int j = 0;j < curRes.size();j++)
                curRes.get(j).add(num[i]);
            
            res.addAll(curRes);
        }
        return res;
    }
    private ArrayList<ArrayList<Integer>> twoSum(int[] num, int end,int target)
    {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        if(num == null || num.length <= 1)
            return res;
        int l = 0;
        int r = end;x
        while(l < r)
        {
            if(num[l] + num[r] == target)
            {
                ArrayList<Integer> item = new ArrayList<Integer>();
                item.add(num[l]);
                item.add(num[r]);
                res.add(item);
                l++;
                r--;
                while(l < r && num[l] == num[l-1])
                    l++;
                while(l < r && num[r] == num[r+1])
                    r--;
            }
            else if(num[l] + num[r] > target)
                r--;
            else
                l++;
        }
        return res;
    }
}