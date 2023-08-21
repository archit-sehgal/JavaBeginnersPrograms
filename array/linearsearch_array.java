import java.util.*;
public class linearsearch_array {
    public static int linearsearch(String strings[], String name) {
        int length = (int) strings.length;
        for (int i = 0; i < length; i++) {
            if (strings[i] == name) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String strings[] = { "archit", "sarang", "vansh", "chinu", "harsh", };
        String name="harsh";
        int index=linearsearch(strings, name);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("name is at index no: "+index);
        }
    }
}
