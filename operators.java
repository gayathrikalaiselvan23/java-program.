import java.io.*;

class operators {
    public static void main(String[] g) throws IOException {
        BufferedReader yg = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(yg.readLine());
        int b = Integer.parseInt(yg.readLine());

        System.out.println("Addition:" + (a + b));
        System.out.println("Subtraction:" + (a - b));
        System.out.println("Multiplication:" + (a * b));
        System.out.println("Division:" + (a / b));
        System.out.println("Remainder:" + (a % b));
    }
}