class  example{
    int data = 18;
}
class example2 extends example{
    int data = 24;
}
public class Shadowing{
    public static void main(String[]a){
        example2 s1 = new example2();
        System.out.println("value of s1 :"+s1.data);

    }
}