import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Type a number : ");
        Scanner sc = new Scanner(System.in);

        int nr = sc.nextInt();

        if(nr>0)
        {
            System.out.println("The number is positive + ");
        }
        else
        {
            System.out.println("The number is negative - ");
        }
    }
}