public class Recursion{
    public static void main (String [] args){
        int result = sumOfRange(3);
        System.out.println(result);
    }
    public static int sumOfRange(int num){
        if(num > 0){
            return num + sumOfRange(num-1);
        }else{
            return 0;
        }
    }
}