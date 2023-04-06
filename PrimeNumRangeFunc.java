import java.util.Scanner;

public class PrimeNumRangeFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lower limit ::");
        int low = sc.nextInt();
        System.out.println("Higher limit ::");
        int high = sc.nextInt();
        // for loop approach
        System.out.println("Prime numbers in given range are :");
        while (low < high) {
            boolean flag = false;

            for (int i = 2; i <= low / 2; ++i) {
                // condition for nonprime number
                if (low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1) {
                System.out.print(low + " ");
            }
            ++low;
        }
    }
    public void primeNumRangeFunc(int lower, int higher){

    }
}