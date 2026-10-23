import java.util.List;

public class Osszegek {
    public static void main(String[] args){
        String s = "90146852";
        int osszeg = 0;
        for(int i = 0; i < s.length(); ++i){
            int aktualis = '0' - Character.valueOf(s.charAt(i));
            osszeg += aktualis;
        }
        osszeg = Math.abs(osszeg);
        System.out.println(osszeg);
    }
}
