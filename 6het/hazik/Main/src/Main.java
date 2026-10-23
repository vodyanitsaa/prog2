import java.util.Scanner;

class Main{
    public static void main(String[] args){
        String szo = PyUtils.input("Kérek egy szót: ");
        System.out.println(StringUtils.randomCase(szo));
    }
}