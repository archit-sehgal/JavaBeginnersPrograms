public class forloop1 {
    public static void main(String args[]){
        // int i=1;
        // for(int line=1;line<=4;line++){
        //     System.out.println("*  *  *  *");
        // }
        // int line=1;
        // while(line<=4){
        //     System.out.println("****");
        //     line++;
        // }
        int n=10899;
        int rev=0;
        while(n>0){
            int lastdigit= n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
        System.out.print(rev);
    }
}
