// public class hollowpatterns {

//     public static void hollow_rectangle(int ros, int cols) {
//         for (int i = 1; i <= ros; i++) {
//             for (int j = 1; j <= cols; j++) {
//                 if (i == 1 || i == ros || j == 1 || j == cols) {
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         hollow_rectangle(4, 9);
//     }
// }
public class hollowpatterns {
    public static void inverted_half_pyramid(int n){
        for(int i=1;i<=n;i++){
            // for spaces
            // 4-1=3; 4-2=2; 4-3=1; 4-4=0;
            for(int spaces=1;spaces<=n-i;spaces++){
                System.out.print(" "+i);
            }
            // stars
            // stars=rows
            for(int stars=1;stars<=i;stars++){
                System.out.print(" *");
            }
        System.out.println();
        }
    }

    public static void main(String args[]) {
        inverted_half_pyramid(4);
    }
}