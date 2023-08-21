import java.util.*;

public class array{
    public static void main(String args[]){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter physics marks: ");
        marks[0]=sc.nextInt();//saved in array
        System.out.print("Enter Chemistry marks: ");
        marks[1]=sc.nextInt();//saved in array
        System.out.print("Enter Maths marks: ");
        marks[2]=sc.nextInt();//saved in array
        System.out.println("phy:   "+marks[0]);
        System.out.println("chem:  "+marks[1]);
        System.out.println("maths: "+marks[2]);
        System.out.println("Total marks are: "+(marks[0]+marks[1]+marks[2])+" out of 300 marks");
    }
}
