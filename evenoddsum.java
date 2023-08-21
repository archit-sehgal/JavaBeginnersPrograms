import java.util.*;

public class evenoddsum {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            int choice;
            int evensum = 0;
            int oddsum = 0;
            do {
                System.out.println("enter the number: ");
                num = sc.nextInt();

                if (num % 2 == 0) {
                    evensum += num;
                } else {
                    oddsum += num;
                }
                System.out.println("do you want to continue?1 to continue or 0 to stop: ");
                choice = sc.nextInt();
            } while (choice == 1);

            System.out.println("sum of even number: " + evensum);
            System.out.println("sum of odd numbers: " + oddsum);
        }
    }
}
