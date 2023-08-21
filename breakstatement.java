import java.util.*;
public class breakstatement {
    public static void main(String args[]){
        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("out of loop");

        try (Scanner sc = new Scanner(System.in)) {
            do{
                System.out.println("enter your number");
                int n=sc.nextInt();
                if(n%10==0){
                    System.out.println("you entered wrong number");
                    continue;
                }
                System.out.println("number was: "+n);
            }while(true);
        }

        // for(int i=1;i<=5;i++){
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }
    }
}
