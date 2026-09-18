class TicketBooking {
    int availableTickets = 10;

    synchronized void bookTicket(String customerName, int tickets) {
        System.out.println(customerName + " wants to book " + tickets + " tickets");

        if (tickets <= availableTickets) {
            System.out.println(customerName + " is booking tickets");

            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            availableTickets = availableTickets - tickets;

            System.out.println(customerName + " has successfully booked "
                    + tickets + " tickets");
            System.out.println("Tickets remaining: " + availableTickets);
        } else {
            System.out.println(customerName + " - Not enough tickets available");
            System.out.println("Tickets remaining: " + availableTickets);
        }

        System.out.println(".........");
    }
}

class Customer extends Thread {
    TicketBooking booking;
    String customerName;
    int tickets;

    Customer(TicketBooking booking, String customerName, int tickets) {
        this.booking = booking;
        this.customerName = customerName;
        this.tickets = tickets;
    }

    public void run() {
        booking.bookTicket(customerName, tickets);
    }
}

public class Multithreadingex {
    public static void main(String[] args) {

        TicketBooking booking = new TicketBooking();

        Customer customer1 = new Customer(booking, "Customer1", 4);
        Customer customer2 = new Customer(booking, "Customer2", 5);
        Customer customer3 = new Customer(booking, "Customer3", 3);

        customer1.start();
        customer2.start();
        customer3.start();
    }
}