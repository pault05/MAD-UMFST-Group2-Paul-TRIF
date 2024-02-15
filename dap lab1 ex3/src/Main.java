import java.util.Scanner;

public class Main {
    public static boolean e_prim(int n)
    {
        boolean prim = true;

        if(n<2)
        {
            prim = false;
        }

        for(int d = 2; d * d <= n; d++)
        {
            if(n % d == 0)
            {
                prim = false;
            }
        }

        if(prim)
        {
            return true;
        }
        else
        {
           return false;
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("N = ");
        n = sc.nextInt();

        int[] v = new int[100];
        int j=0;
        int m=0;
        for(int i=0; i<n; i++)
        {
            if(e_prim(i))
            {
                v[j]=i;
                j++;
                m++;
            }
        }

        for(j=0; j<m; j++)
        {
            if(v[j] == v[j+1]-2)
            {
                System.out.println( "(" + v[j] + " , " + v[j+1] + " )");
            }
        }

    }
}