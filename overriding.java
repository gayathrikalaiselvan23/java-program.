class meow{
    static void print(){
        System.out.println("gayu");
    }
}
class land extends meow{
    static void print(){
        System.out.println("gayathri");
    }
}
public class overriding{
    public static void main(String[] g){
        meow obj = new land();
        obj.print();
    }
}