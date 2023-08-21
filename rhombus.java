public class rhombus {
    
    public static void rhombus_pattern(int n){
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    
    public static void main(String args[]){
        rhombus_pattern(5);
    }
}
