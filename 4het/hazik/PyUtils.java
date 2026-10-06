import java.util.ArrayList;
import java.util.List;

public class PyUtils{
    private PyUtils(){
        
    }

    public static List<Integer> range(int a, int b){
        List<Integer> lista1 = new ArrayList<>();
        for(int i = a; i < b; ++i){
            lista1.add(i);
        }
        return lista1;
    }

    public static List<Integer> range(int a){
        List<Integer> lista2 = new ArrayList<>();
        for(int i = 0; i < a; ++i){
            lista2.add(i);
        }
        return lista2;
    }

    public static List<Integer> range(int a, int b, int h){
        List<Integer> lista3 = new ArrayList<>();
        for(int i = a; i < b; i += h){
            lista3.add(i);
        }
        return lista3;
    }
}