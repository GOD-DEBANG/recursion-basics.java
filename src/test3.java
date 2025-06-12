import java . util.Scanner;
public class test3 {
    public static  void num(int number){
        if(number == 0){
            return ;
        }
        num(number-1);        //Print numbers from 1 to N using recursion.
        System.out.println(number);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 10;
        num(num1);
        System.out.println(num1);
        sc.close();
    }
}
