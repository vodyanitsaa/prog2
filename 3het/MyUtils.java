
import java.util.Arrays;

public class MyUtils{
    public static void reverse(int[] tomb){
        int i = 0;
        int j = tomb.length - 1;
        while(i < j){
            int temp = tomb[j];
            tomb[j] = tomb[i];
            tomb[i] = temp;
            ++i;
            --j;
        }
    }

    public static void sortDescending(int[] tomb){
        Arrays.sort(tomb);
        reverse(tomb);
    }
}