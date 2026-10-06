public class Wrapper{
    public static void main(String[] args){

        System.out.println("--- Character osztály bemutatása ---");
        
        char tesztKarakter1 = '5';
        char tesztKarakter2 = 'a';
        System.out.println("Metódus: Character.isDigit(char ch)");
        System.out.println("Leírás: Megvizsgálja, hogy a karakter számjegy-e.");
        System.out.println("Character.isDigit('" + tesztKarakter1 + "') -> " + Character.isDigit(tesztKarakter1));
        System.out.println("Character.isDigit('" + tesztKarakter2 + "') -> " + Character.isDigit(tesztKarakter2));

        System.out.println("--------------------------------------------------");

        char kisbetu = 'k';
        System.out.println("Metódus: Character.toUpperCase(char ch)");
        System.out.println("Leírás: Nagybetűssé alakítja a karaktert.");
        System.out.println("Character.toUpperCase('" + kisbetu + "') -> '" + Character.toUpperCase(kisbetu) + "'");

        System.out.println("\n=================================================\n=");

        System.out.println("--- Integer osztály bemutatása ---");

        String szamSzoveg = "1234";
        int konvertaltSzam = Integer.parseInt(szamSzoveg);
        System.out.println("Metódus: Integer.parseInt(String s)");
        System.out.println("Leírás: String típusú szöveget int számmá alakít.");
        System.out.println("Integer.parseInt(\"" + szamSzoveg + "\") + 10 -> " + (konvertaltSzam + 10));

        System.out.println("--------------------------------------------------");

        int decimalisSzam = 42;
        System.out.println("Metódus: Integer.toBinaryString(int i)");
        System.out.println("Leírás: A számot kettes számrendszerbeli szöveges formátummá alakítja.");
        System.out.println("Integer.toBinaryString(" + decimalisSzam + ") -> " + Integer.toBinaryString(decimalisSzam));

        System.out.println("\n==================================================\n");

        System.out.println("--- Double osztály bemutatása ---");

        double nanErtek = Math.sqrt(-1.0);
        double normalErtek = 25.0;
        System.out.println("Metódus: Double.isNaN(double v)");
        System.out.println("Leírás: Megvizsgálja, hogy a valós szám NaN (Not-a-Number) érték-e.");
        System.out.println("Double.isNaN(Math.sqrt(-1.0)) -> " + Double.isNaN(nanErtek));
        System.out.println("Double.isNaN(25.0) -> " + Double.isNaN(normalErtek));

        System.out.println("--------------------------------------------------");

        double d1 = 3.14;
        double d2 = 2.71;
        System.out.println("Metódus: Double.compare(double d1, double d2)");
        System.out.println("Leírás: Két lebegőpontos számot hasonlít össze.");
        System.out.println("Double.compare(" + d1 + ", " + d2 + ") -> " + Double.compare(d1, d2));

        System.out.println("\n==================================================\n");

        System.out.println("--- Boolean osztály bemutatása ---");

        String szovegIgaz = "TRUE";
        String szovegHamis = "nem";
        System.out.println("Metódus: Boolean.parseBoolean(String s)");
        System.out.println("Leírás: Szöveget boolean típusra alakít (\"true\" -> true, minden más -> false).");
        System.out.println("Boolean.parseBoolean(\"" + szovegIgaz + "\") -> " + Boolean.parseBoolean(szovegIgaz));
        System.out.println("Boolean.parseBoolean(\"" + szovegHamis + "\") -> " + Boolean.parseBoolean(szovegHamis));

        System.out.println("--------------------------------------------------");

        boolean a = true;
        boolean b = false;
        System.out.println("Metódus: Boolean.logicalXor(boolean a, boolean b)");
        System.out.println("Leírás: Logikai kizáró vagy (XOR) művelet végrehajtása.");
        System.out.println("Boolean.logicalXor(true, false) -> " + Boolean.logicalXor(a, b));
        System.out.println("Boolean.logicalXor(true, true)  -> " + Boolean.logicalXor(true, true));
    }
}