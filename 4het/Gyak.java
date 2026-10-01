class Pair{
    public int a;
    public int b;
}

class Proba{
    public int add(int a, int b){
        System.out.println("# v1");
        return a + b;
    }

    public double add(double a, double b){
        System.out.println("# v2");
        return a + b;
    }
}

public class Gyak{
    public static void main(String[] args) {
        int[] szamok = {1, 2, 3, 4};

        //for(int n : szamok){
        //    System.out.println(n);
        //}

        Pair pair = getFirstAndLast(szamok);
        System.out.println(pair.a);
        System.out.println(pair.b);
        System.out.println("\n");

        Proba p = new Proba();
        System.out.println(p.add(2, 3));
        System.out.println(p.add(2.3, 3.2));
    }

    static Pair getFirstAndLast(int[] numbers){
        Pair pair = new Pair();
        pair.a = numbers[0];
        pair.b = numbers[numbers.length - 1];
        return pair;
    }

}