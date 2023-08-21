import java.util.*;
public class arithmetic_operands{
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter two numbers:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("add = "+(a+b));
            System.out.println("subtract = "+(a-b));
            System.out.println("multiply = "+(a*b));
            System.out.println("divide = "+(a/b));
            System.out.println("remainder = "+(a%b));
        }
    }
}