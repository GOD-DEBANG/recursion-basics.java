import java.util.Scanner;

public class test7 {
    public static int sum(int i){
             if(i == 0){
                 return 0;//Find the sum of digits of a number using recursion.
             }
             return (i % 10) + sum(i / 10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = sum(num);
        System.out.println(result);
        sc.close();
    }
}
