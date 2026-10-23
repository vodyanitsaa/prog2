import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;;
// import java.util.Scanner;

public class Gyak{
    public static void main(String[] args){

        // Scanner scanner = new Scanner(System.in);
        // System.out.printf("Kérem az első számot: ");
        // int a = Integer.parseInt(scanner.nextLine());
        // System.out.printf("Kérem a második számot: ");
        // int b = Integer.parseInt(scanner.nextLine());
        // System.out.println("A két szám összege: " + (a + b));

        System.out.println(Arrays.toString(args));

        // if(args.length != 2){
        //     System.out.println("Pontosan két számot adj meg!");
        //     System.exit(1);
        // }
        int szam1 = Integer.parseInt(args[0]);
        int szam2 = Integer.parseInt(args[1]);
        System.out.println("A két szám összege: " + (szam1 + szam2));

        List<Integer> szamok = new ArrayList<>(List.of(5, 2, 6));
        System.out.println(szamok);

        int code = (int)'A';
        System.out.println("A: " + code);

        String s = "90146852";
        int osszeg = szamjegyekOsszege(s);
        System.out.println(osszeg);
    }
    public static int szamjegyekOsszege(String s){
        int osszeg = 0;
        for(char szam: s.toCharArray()){
            osszeg += Character.getNumericValue(szam);
        }
        return osszeg;
    }
}