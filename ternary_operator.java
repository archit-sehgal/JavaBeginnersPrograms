import java.util.*;
public class ternary_operator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String x=((num%2)==0)? "even":"odd";
        System.out.println(x);

    }
}
