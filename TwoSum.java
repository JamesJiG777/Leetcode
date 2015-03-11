public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length < 2 || target < 1)
            return null;
        int[] result = new int[2];
        Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++)
        {
            if(hashTable.containsKey((Integer)numbers[i]) && target < numbers[i] / 2)
            {
                result[0] = hashTable.get(numbers[i]);
                result[1] = i;
            }
            else
            {
                hashTable.put((target - numbers[i]), (i));
                
            }
        }
        
        return result;
    }
}