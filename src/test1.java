public class test1 {

        public static String num(String num1){
            String num2 = "Hello world";
            for(int i =0; i<100; i++){
                System.out.println(num2);
            }
            return  num2;
        }
        public static void main(String[]  args){
            String name = num("input string");
            System.out.println("Returnd"+name);
        }
    }

