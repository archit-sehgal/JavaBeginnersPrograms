public class largest {

    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//- infinity
        int smallest=Integer.MAX_VALUE;//+ infinity
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest number is: "+smallest);
        return largest;
    }
    public static void main(String args[]){
        int number[]={1,2,6,5,3};
        System.out.println("largest number is: "+getlargest(number));   
    }
}
