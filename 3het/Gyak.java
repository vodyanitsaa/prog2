import java.util.Scanner;

class Circle
{
    private double r;
    public Circle(double r)
    {
        this.r = r;
    }
    public double kerulet()
    {
        return 2 * r * Math.PI;
    }
    public double terulet()
    {
        return r * r * Math.PI;
    }
    public boolean isSmallerThan(Circle other)
    {
        return this.kerulet() < other.kerulet();
    }
}

public class Gyak
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem a kör sugarát: ");
        int r = scanner.nextInt();

        Circle circle = new Circle(r);

        double ker = circle.kerulet();
        double ter = circle.terulet();

        System.out.printf("A kör kerülete: %.2f\n", ker);
        System.out.printf("A kör területe: %.2f\n", ter);
    }
}
