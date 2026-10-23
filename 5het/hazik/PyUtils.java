import java.util.Scanner;

class PyUtils {
    public PyUtils(){
        //nem példányosítható
    }

    static String input(String szoveg) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s", szoveg);
        String sor = scanner.nextLine();

        return sor;
    }
}
