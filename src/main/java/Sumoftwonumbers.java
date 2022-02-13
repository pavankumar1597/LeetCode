import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Sumoftwonumbers {

        public static int[] twoSum(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap();

            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target - nums[i])){
                    return new int[]{i,map.get(target - nums[i])};
                }else{
                    map.put(nums[i], i);
                }

            }
            return new int[]{} ;


        }


    public static int[] twoNumberSum(int[] array, int targetSum) {

        Arrays.sort(array);
        int l = 0;
        int r= array.length-1;

        while(l<r){
            int sum =array[l]+array[r] ;
            if(sum==targetSum){
                return new int[]{array[l],array[r]};
            }else if (sum<targetSum){
                l++;

            }else if (sum>targetSum)
                r--;

        }
        return new int[]{};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum(new int[] {4, 6, 1}, 5)));
    }
}
