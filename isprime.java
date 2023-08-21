public class isprime {

    public static boolean isprime(int num) {
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)==true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        prime(2000);
    }
}
