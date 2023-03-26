import java.util.*;
public class Countdigits {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ::");
        int num = sc.nextInt();
        int orgNum = num;
        while(num !=0 ){
            num /= 10;
            count ++;
        }
        System.out.println("The total digits are : "+count+" in number : "+orgNum);
    }
}
