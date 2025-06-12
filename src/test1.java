import java.util.Scanner;

public class test1{
    public static int natural(int r ){
        if(r == 1){
            return 1;
        }
        return r + natural(r-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();         // Find the sum of first N natural numbers using recursion.
       int sum_of_natural = natural(sum);
        System.out.println(sum_of_natural);
        sc.close();
    }
}