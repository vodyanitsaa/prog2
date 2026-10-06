import java.util.ArrayList;
import java.util.List;

public class MinMax{
    public record minMax(int min, int max){
    }
    public static void main(String[] args){
        List<Integer> szamok = new ArrayList<>(List.of(5, 6, 3, 9, 4, 2, 7, 99));
        szamok.add(1);

        System.out.println("Számok: " + szamok);

        int[] tombEredmeny = keresMinMaxTombbel(szamok);
        System.out.println("Tömb: Min = " + tombEredmeny[0] + ", Max = " + tombEredmeny[1]);

        List<Integer> listaEredmeny = keresMinMaxListaval(szamok);
        System.out.println("Lista: Min = " + listaEredmeny.get(0) + ", Max = " + listaEredmeny.get(1));

        minMax objektumEredmeny = keresMinMaxObjektummal(szamok);
        System.out.println("Objektum: Min = " + objektumEredmeny.min() + ", Max = " + objektumEredmeny.max());
    }

    public static int[] keresMinMaxTombbel(List<Integer> lista){
        int min = lista.get(0);
        int max = lista.get(0);

        for (int i = 1; i < lista.size(); i++){
            int elem = lista.get(i);
            if (elem < min) min = elem;
            if (elem > max) max = elem;
        }

        return new int[]{min, max};
    }

    public static List<Integer> keresMinMaxListaval(List<Integer> lista){
        int min = lista.get(0);
        int max = lista.get(0);

        for (int i = 1; i < lista.size(); i++){
            int elem = lista.get(i);
            if (elem < min) min = elem;
            if (elem > max) max = elem;
        }

        return List.of(min, max);
    }

    public static minMax keresMinMaxObjektummal(List<Integer> lista){
        int min = lista.get(0);
        int max = lista.get(0);

        for (int i = 1; i < lista.size(); i++){
            int elem = lista.get(i);
            if (elem < min) min = elem;
            if (elem > max) max = elem;
        }

        return new minMax(min, max);
    }
}