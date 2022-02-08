import java.util.HashMap;

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

    public static void main(String[] args) {

    }
}
