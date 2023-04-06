import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ::");
        int num = sc.nextInt();
        boolean flag = false;
        // for loop approach
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        // while loop approach
        int j = 2;
        while(j <= num){
            if (num % j == 0) {
                flag = true;
                break;
            }
            ++j;
        }
        // print the result
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}