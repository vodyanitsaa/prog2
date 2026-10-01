import java.util.Arrays;

public class Helyben{
    static int[] getOneToFive(){
        int[] result = {1,2,3,4,5};
        return result;
    }

    public static void main(String[] args) {
        int[] five = getOneToFive();
        MyUtils.reverse(five);
        System.out.println(Arrays.toString(five));

        int[] six = {1,2,3,4,5,6};
        MyUtils.sortDescending(six);
        System.out.println(Arrays.toString(six));
    }
}