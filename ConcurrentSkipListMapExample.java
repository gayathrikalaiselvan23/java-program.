import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {

    public static void main(String[] args) {

        ConcurrentSkipListMap<Integer, String> Students =
                new ConcurrentSkipListMap<>();

        Students.put(105, "Kumar");
        Students.put(102, "Selva");
        Students.put(101, "Arun");
        Students.put(104, "Priya");
        Students.put(103, "Ravi");

        System.out.println("Students: " + Students);

        System.out.println("Student 103: " + Students.get(103));

        System.out.println("First ID: " + Students.firstKey());

        System.out.println("Last ID: " + Students.lastKey());

        System.out.println("Higher than 103: " + Students.higherKey(103));

        System.out.println("Lower than 103: " + Students.lowerKey(103));

        Students.remove(102);

        System.out.println("After removing 102: " + Students);
    }
}