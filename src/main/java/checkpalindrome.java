public class checkpalindrome {

    static boolean isPalindrome(int i){


        int sum = 0 ;
        while(i > sum){
            sum =sum*10+i%10;
            i=i/10;
        }


        if(sum == i || i == sum/10  ){

         return  true  ;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1212121));
        ;
    }


}
