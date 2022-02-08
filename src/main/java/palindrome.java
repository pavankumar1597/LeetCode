public class palindrome {

    public static boolean isPalindrome(int x) {
        if(x<0 || (x !=0 && x%10 ==0)) return false ;
        int rev =0 ;
        while(x > rev ){
            rev = x%10 + rev*10;   //1
            x= x/10 ;  // 12
        }
        if(rev/10==x)
            return true ;
        return false;


    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(1111111111));
        ;
    }



}
