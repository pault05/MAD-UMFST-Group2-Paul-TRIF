import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] v = new int [100];
        System.out.println("Array elements : ");

        int sum=0;
        for(int i = 0; i < n; ++i)
        {
            v[i]=sc.nextInt();
            sum=sum+v[i];
        }

        for(int i = 0; i < n; ++i)
        {
            System.out.println(v[i]);
        }

        System.out.println("Result : ");

        int res = sum/n;

        System.out.println(res);

    }
}