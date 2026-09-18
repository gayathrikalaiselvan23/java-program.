
import java.util.Scanner;

class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter " + n + " values:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        int even = 0, odd = 0;

        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of even numbers: " + even);
        System.out.println("Number of odd numbers: " + odd);
    }
}

