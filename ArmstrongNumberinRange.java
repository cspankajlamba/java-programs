import java.util.Scanner;

class ArmstrongNumberinRange {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Range : Low & High ");
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println("Armstrong Numbers between "+low+" & "+high+" are :");
        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }
}
