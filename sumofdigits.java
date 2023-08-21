public class sumofdigits {
    public static void sumofint(int n){
        int sum=0;
        while(n>0){
        int lastdigit=n%10;
        sum=sum+lastdigit;
        n=n/10;
        }
        System.out.println(sum);
    }
    public static void main (String args[]){
        sumofint(2002);
    }
}
