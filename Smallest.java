
class Smallest
{
    public static void main(String[] args)
    {
        int a[] = {25, 10, 45, 5, 30};

        int small = a[0];

        for(int i = 1; i < a.length; i++)
        {
            if(a[i] < small)
                small = a[i];
        }

        System.out.println("Smallest number: " + small);
    }
}


