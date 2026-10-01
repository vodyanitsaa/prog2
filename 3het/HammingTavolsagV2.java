import java.util.Scanner;

class Hamming{
    private Hamming(){
    }
    public static int distance(String sz1, String sz2) {
        if (sz1.length() != sz2.length()) {
            return -1;
        }

        int hammingSzam = 0;
        for (int i = 0; i < sz1.length(); i++) {
            if (sz1.charAt(i) != sz2.charAt(i)) {
                hammingSzam += 1;
            }
        }
        return hammingSzam;
    }
}

public class HammingTavolsagV2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a két szót:");
        String szo1 = scanner.nextLine();
        String szo2 = scanner.nextLine();

        int tav = Hamming.distance(szo1, szo2);
        if(tav < 0){
            System.out.println("A két szó hossza nem egyezik!");
        }else{
            System.out.printf("A két szó Hamming-távolsága: %d\n", tav);
        }
    }
}