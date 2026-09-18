import java.io.*;

class array
{
    public static void main(String[] gayu) throws IOException
    {
        BufferedReader yogesh = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Enter the size of array");
        int size = Integer.parseInt(yogesh.readLine());

        int y[] = new int[size];

        System.out.println("Enter " + size + " values of array");

        for(int j = 0; j < size; j++)
        {
            y[j] = Integer.parseInt(yogesh.readLine());
        }

        System.out.println("Array values displayed");

        for(int i = 0; i < y.length; i++)
        {
            System.out.println(y[i]);
        }
    }
}