import java.util.Scanner;

public class test8 {
    public static int count(int a){
        if(a == 0){
            return 0;
        }
        return 1+count(a/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();        //Count the number of digits in a number using recursion
        int result = count(a);
        System.out.println(result);
        sc.close();
    }
}
