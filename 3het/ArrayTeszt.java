import java.util.Arrays;

public class ArrayTeszt{
    public static void main(String[] args){
        int[] t1 = {1, 2, 3};
        int[] t2 = {1, 2, 3};
        int[] t3 = {1, 2, 4};
        System.out.println("t1: " + Arrays.toString(t1));
        System.out.println("t2: " + Arrays.toString(t2));
        System.out.println("t3: " + Arrays.toString(t3));
        System.out.println("t1 == t2? " + MyArrayUtils.equals(t1, t2));
        System.out.println("t1 == t3? " + MyArrayUtils.equals(t1, t3));

        int[] t4 = new int[5];
        System.out.println("t4: " + Arrays.toString(t4));
        MyArrayUtils.fill(t4, 56);
        System.out.printf("t4 feltöltés után: ");
        for (int i = 0; i < t4.length; ++i){
            int szam = t4[i];
            System.out.print(szam + " ");
        }
        System.out.println("");

        int[] t5 = {5, 2, 8, 1, 9};
        System.out.println("t5: " + Arrays.toString(t5));
        MyArrayUtils.sort(t5);
        System.out.print("t5 rendezés után: ");
        for (int i = 0; i < t5.length; ++i){
            int szam = t5[i];
            System.out.print(szam + " ");
        }
        System.out.println("");
    }
}