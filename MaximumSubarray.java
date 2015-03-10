public class MaxiumSubArray{
    public int maxSubArray(int[] A){
        if(A = 0 || A.length = 0)
            return 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            if (max < sum)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}