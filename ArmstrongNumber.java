import java.util.*;
import java.lang.Math;
class ArmstrongNumber{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        int powSum = 0; int count = 0;
        int orgNum = num;
        while(num != 0){
            num /= 10;
            count++;
        }
        num = orgNum;
        while(num != 0){
            int rem = num % 10;
            powSum += Math.pow(rem,count);
            num /= 10;
        }
        if(orgNum == powSum){
            System.out.println(orgNum+" is a Armstrong number.");
        }
        else{
            System.out.println(orgNum+" is NOT a Armstrong number.");
        }
    }
}