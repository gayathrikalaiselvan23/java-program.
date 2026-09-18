import java.util.Scanner;
import java.util.Stack;
public class LargestStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter" + n + "elements");
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }
        int largest = stack.get(0);
        for (int i = 1; i < stack.size(); i++) {
            if (stack.get(i) > largest) {
                largest = stack.get(i);
            }
        }
        System.out.println("stack: " + stack);
        System.out.println("Largest element: " + largest);
        sc.close();
    }
    
}
