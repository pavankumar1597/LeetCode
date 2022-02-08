
public class AddDigits {
    public static void addDigits(int num) {
        int num1 = 0;
        int num2 =0;

        int sum =0 ;


        while(num>0){
            sum += num%10;
            num= num/10;
if( num==0 && sum>9) {num = sum;
sum=0;}

        }
        System.out.println(sum);

    }


    public static void main(String[] args) {
        System.out.println("skjfnsakjfa");
        addDigits(38);
    }


}
