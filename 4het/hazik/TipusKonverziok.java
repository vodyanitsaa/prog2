public class TipusKonverziok {
    public static void main(String[] args) {
        long l = Long.parseLong("123");
        float f = Float.parseFloat("3.14");
        double d = Double.parseDouble("7.89");
        char c = "a".charAt(0);

        System.out.println("long érték: " + l);
        System.out.println("float érték: " + f);
        System.out.println("double érték: " + d);
        System.out.println("char érték: " + c);
    }
}