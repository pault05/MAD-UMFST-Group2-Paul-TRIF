import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Carte c1 = new Carte(sc.next(), sc.next(), sc.nextInt());

        System.out.println(c1.getTitlu());

        c1.setTitlu("basme");

        System.out.println(c1.toString());

    }
}