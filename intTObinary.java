import java.util.Scanner;

class Converter{
    
    static String toBinary(int x){
        String binary = "";
        while(x > 0){
            binary = (x%2)+ binary;
            x /= 2 ;
        }
        return binary;
    }
}

public class intTObinary {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String result = Converter.toBinary(x);
        System.out.print(result);
    }
}
