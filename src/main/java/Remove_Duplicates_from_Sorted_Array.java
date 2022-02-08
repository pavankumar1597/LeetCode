public class Remove_Duplicates_from_Sorted_Array {


    public static void main(String[] args) {

        int[] arr ={1,1,2,3,4,4,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {

        int i=0;
        for(int j=1 ;j<nums.length;j++) if(nums[i]==nums[j]) continue;else nums[++i] = nums[j];

return ++i;





    }

}
