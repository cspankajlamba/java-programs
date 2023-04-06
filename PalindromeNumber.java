import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ::");
        int num = sc.nextInt();
        int orgNum = num;
        int rvsNum = 0;
        if(num >=0){
            while(num !=0 ){
                int rem = num % 10;
                rvsNum = (rvsNum*10)+rem;
                num /= 10;
            }
        }
        if(rvsNum == orgNum){
            System.out.println(orgNum+" is a Palindrome number.");
        }
        else{
            System.out.println(orgNum+" is NOT a Palindrome number.");
        }
    }
}