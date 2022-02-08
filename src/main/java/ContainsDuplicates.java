import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicates {


    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
for (int i = 0; i <nums.length;i++){
    if(map.containsKey(nums[i])){
        return  true;
    }
}
    return false;
    }





    public boolean containsDuplicate2(int[] nums) {

        HashSet<Integer> map = new HashSet<>();
        for (int i = 0; i <nums.length;i++){
            return !map.add(nums[i]);
        }
        return false;
    }



    public static void main(String[] args) {

    }
}
