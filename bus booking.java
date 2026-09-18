import java.util.Scanner;

class busbooking{
    public static void main(String[] buss) {
        Scanner bus = new Scanner(System.in);

        int[][] seats = new int[5][4];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = 0;
            }
        }

        System.out.println("Bus Seat Assignment");
        System.out.println("\nAvailable Seats:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + (i + 1) + "," + (j + 1) + "] ");
            }
            System.out.println();
        }

        System.out.print("\nEnter row no (1-5): ");
        int row = bus.nextInt();

        System.out.print("Enter seat no (1-4): ");
        int seat = bus.nextInt();

        if (row < 1 || row > 5 || seat < 1 || seat > 4) {
            System.out.println("Invalid seat number!");
        } else if (seats[row - 1][seat - 1] == 1) {
            System.out.println("Seat is already booked!");
        } else {
            seats[row - 1][seat - 1] = 1;
            System.out.println("Seat booked successfully! Happy journey!");
        }

        System.out.println("\nFinal seat arrangement");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (seats[i][j] == 0) {
                    System.out.print("[Available] ");
                } else {
                    System.out.print("[Booked] ");
                }
            }
            System.out.println();
        }

        bus.close();
    }
}