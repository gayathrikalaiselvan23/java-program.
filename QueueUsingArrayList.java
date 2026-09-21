
import java.util.ArrayList;
import java.util.Scanner;
public class QueueUsingArrayList {
    static ArrayList <Integer> queue = new ArrayList<>();
    static void enqueue(int value){
        queue.add(value);
        System.out.println(value + " added to queue");
    }
    static void dequeue(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty");
        } else{
            int value = queue.remove(0);
            System.out.println(value + " removed from queue");
        }
    }
    static void display(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty");
        } else{
            System.out.println("Queue: " + queue);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter" + n + "elements");
        for(int i = 0; i < n; i++){
            enqueue(sc.nextInt());
        }
        display();
        dequeue();
        display();
        sc.close();
    }

}