import java.util.Scanner;

public class test5 {
    public static int fibo(int num){
        if(num == 1){
            return 1;
        }
        if(num == 0 ){
            return 0;
        }
        return fibo(num - 1)+ fibo(num - 2);
    }
    public static void main(String[] args){
           Scanner sc = new Scanner(System.in);     //Find the nth Fibonacci number using recursion.
            int num = sc.nextInt();
            int result = fibo(num);
        System.out.println(result);
        sc.close();
    }
}
