import java.util.Scanner;

public class test6 {
    public static int power(int a , int b){
        if(b == 0){
            return 1;
        }                //Calculate power of a number: a^b using recursion.
        return a*power(a,b-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = power(a,b);
        System.out.println(result);
        sc.close();
    }
}
