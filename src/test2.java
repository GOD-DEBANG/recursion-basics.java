import java.util.Scanner;
public class test2 {
    public static int add(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return add(num1 + 1, num2 - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = add(num1, num2);
        System.out.println(sum);
        sc.close();
    }
}
