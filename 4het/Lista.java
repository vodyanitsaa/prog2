import java.util.ArrayList;
import java.util.List;

public class Lista{
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(7);
        System.out.println(num);
        kiir(num);

        List<Integer> primes = getFirstTwoPrimes();
        System.out.println(primes);
    }

    static List<Integer> getFirstTwoPrimes(){
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        return primes;
    }

    static void kiir(List numbers){
        System.out.println(numbers);
    }
}