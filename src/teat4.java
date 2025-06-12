import java.util.Scanner;

public class teat4 {
    public static void num(int number){
        if(number ==  0) {
            return;
        }
        System.out.println(number);
        num(number - 1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();        //Print numbers from N to 1 using recursion.
        num(num);

        sc.close();
    }

}
