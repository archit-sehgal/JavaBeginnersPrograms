import java.util.*;
public class whileloop {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number: ");
        int counter=sc.nextInt();
        int n=0;
        while(n<counter){
            n++;
            System.out.println(n);
        }
    }
}
