import java.io.*;
class ofzero {
    public static void main(String[]args)throws IOException {
        BufferedReader gayu = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the mobile number");
        String mobile = gayu.readLine();
        char ch ='0';
        int count = 0;
        for(int i=0; i<mobile.length(); i++) {
            if(mobile.charAt(i) == ch) {
                count++;
            }
        }
        if(count > 0) {
            System.out.println("the zero is present");
            System.out.println(" occurrence of " + ch +" : " + count);
        } else {
            System.out.println("zero is not present");
        }
    }
}