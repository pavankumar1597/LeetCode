import java.util.HashMap;

public class RomanToInteger {


    public static void main(String[] args) {
    convert("III");
    convert("LVIII");
    convert("MCDXLVIII");
    }



    static void convert(String str){

        HashMap<Character ,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);

        int sum = 0;
        int temp = 0;

        char[] c = str.toCharArray();
for(char charr:c){
if(temp < roman.get(charr)){
    temp = roman.get(charr) - temp ;
}else {
    sum += temp;
    temp = roman.get(charr) ;
}
}


        System.out.println(sum+temp);
    }



}
