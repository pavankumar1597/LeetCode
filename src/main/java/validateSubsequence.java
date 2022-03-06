import java.util.Arrays;
import java.util.List;

class Program {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int i = 0;
        int j = 0;
        while(i<array.size() && j<sequence.size()){
            if(array.get(i)==sequence.get(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j>=sequence.size();
    }


    public static void main(String[] args) {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);
        System.out.println(Program.isValidSubsequence(array, sequence));
    }
}
