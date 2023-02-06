import java.util.Scanner; // import statement for Scanner class

public class validtriangle { // class defination
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner class object create
        System.out.println("Enter value of Angle 1st");
        int ang1 = input.nextInt(); // taking integer input
        System.out.println("Enter value of Angle 2nd");
        int ang2 = input.nextInt();
        System.out.println("Enter value of Angle 3rd");
        int ang3 = input.nextInt();
        
        int triangle = ang1 + ang2 + ang3;
      // condition for a triangle - the sum of 3 angles should be equal to 180 degree  
      if(triangle == 180){
            System.out.println("This is a Triangle which angles are "+ang1+","+ang2+","+ang3);
        }
        else{
            System.out.println("This combination of angles does not make a valid triangle");
        }
    }
}
