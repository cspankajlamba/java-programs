import java.util.*;
public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ::");
        int num = sc.nextInt();
        int rvsNum = 0;
        while(num !=0 ){
            int rem = num % 10;
            rvsNum = (rvsNum*10)+rem;
            num /= 10;
        }
        System.out.println("reversed number is : "+rvsNum);
    }
}