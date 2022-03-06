package specialclass;

public class checkSubString {


    public static void main(String[] args) {
        System.out.println(checksString("abc","aaabbabcbccc"));
    }

    private static int checksString(String small, String largestring) {
        int j = 0;
        int start = 0;
        for(int i=0;i < largestring.length() ;i++){
            if(largestring.charAt(i) == small.charAt(j) ){
                j++;

            }else {
                j=0;
            }
            if(j == small.length()){
                start = i - (j -1) ;
                break ;
            }


        }

        return start ;



    }
}
