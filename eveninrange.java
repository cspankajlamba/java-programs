/* Java program to print even numbers between a user given range */
import java.util.*; //Import statement
public class eveninrange { //class defination
    public static void main(String[] args) {  //main method class
        Scanner input = new Scanner(System.in); //scanner class
        System.out.println("Enter min of range -> ");23  //print method
        int min = input.nextInt();
        System.out.println("Enter max of range -> ");
        int max = input.nextInt();
        while(min != max+1){   //while loop
            if(min%2 == 0){
                System.out.println(min);
            }
            min++; //increament
        }
    }
}
