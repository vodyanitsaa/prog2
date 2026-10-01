class Teglalap{
    int a;
    int b;
    public Teglalap(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int kerulet(){
        return 2 * (a + b);
    }
    public int terulet(){
        return a * b;
    }
}

public class Elmelet{
    public static void main(String[] args) {
        Teglalap t1 = new Teglalap(4, 6);

        System.out.println("A téglalap kerülete: " + t1.kerulet());
        System.out.println("A téglalap területe: " + t1.terulet());
    }
}