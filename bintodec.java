public class bintodec{

    public static void binntodecc(int binNum){
        int power=0;
        int decNum=0;
        while(binNum>0){
            int lastdigit=binNum%10;
            decNum=decNum+(lastdigit*(int)Math.pow(2, power));
            power++;
            decNum=decNum/10;
        }
        System.out.println(decNum);
    }

    public static void main(String args[]){
        binntodecc(101);
    }
}