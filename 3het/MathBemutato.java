public class MathBemutato {

    public static void main(String[] args) {
        System.out.println("=== A java.lang.Math osztály 5 hasznos metódusának bemutatása ===");

        System.out.println("");

        System.out.println("1. Math.abs(x) metódus:");
        System.out.println("- Visszaadja a megadott szám abszolút értékét (távolságát a nullától).");
        double negativSzam = -42.75;
        double abszolut = Math.abs(negativSzam);
        System.out.println("Bemenet: " + negativSzam);
        System.out.println("Eredmény: Math.abs(" + negativSzam + ") = " + abszolut);
        elvalasztoVonal();

        System.out.println("2. Math.pow(alap, kitevo) metódus:");
        System.out.println("Leírás: Kiszámítja az alap kitevőre emelt értékét (alap^kitevo).");
        double alap = 2.0;
        double kitevo = 8.0;
        double hatvany = Math.pow(alap, kitevo);
        System.out.println("Bemenet: alap = " + alap + ", kitevő = " + kitevo);
        System.out.println("Eredmény: Math.pow(" + alap + ", " + kitevo + ") = " + hatvany);
        elvalasztoVonal();

        System.out.println("3. Math.sqrt(x) metódus:");
        System.out.println("Leírás: Visszaadja a paraméterként kapott nem-negatív szám négyzetgyökét.");
        double negyzetszam = 81.0;
        double gyok = Math.sqrt(negyzetszam);
        System.out.println("Bemenet: " + negyzetszam);
        System.out.println("Eredmény: Math.sqrt(" + negyzetszam + ") = " + gyok);
        elvalasztoVonal();

        System.out.println("4. Math.asin(x) metódus:");
        System.out.println("Leírás: Visszaadja a paraméterként kapott szám szinuszát.");
        double szinusz = 0.75;
        double eredmeny = Math.asin(szinusz);
        System.out.println("Bemenet: " + szinusz);
        System.out.println("Eredmény: Math.sqrt(" + szinusz + ") = " + eredmeny);
        elvalasztoVonal();

        System.out.println("5. Math.round(x) metódus:");
        System.out.println("Leírás: A lebegőpontos számot a legközelebbi egész számra kerekíti a standard kerekítési szabályok szerint.");
        float szam1 = 5.4f;
        float szam2 = 5.6f;
        System.out.println("Math.round(" + szam1 + ") = " + Math.round(szam1));
        System.out.println("Math.round(" + szam2 + ") = " + Math.round(szam2));
        elvalasztoVonal();
    }

    private static void elvalasztoVonal() {
        System.out.println("----------------------------------------------------------------------");
    }
}