package linkedlist.circularlinkedlist.ticketreservationsystem;



public class Main {
    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        TicketReservation system = new TicketReservation();

        // Add some ticket reservations
        system.addTicket(1, "Akshit Patel", "Avengers: Endgame", 12, "2025-01-28 10:00");
        system.addTicket(2, "Deepak Singh", "Inception", 8, "2025-01-28 12:00");
        system.addTicket(3, "Ujjwal Gupta", "Spider-Man: No Way Home", 15, "2025-01-28 14:00");

        // Display all tickets
        system.displayTickets();

        // Search for a ticket by Customer Name
        system.searchTicket("Rishi thakur");

        // Remove a ticket by Ticket ID
        system.removeTicketByID(2);

        // Display all tickets after removal
        system.displayTickets();

        // Get total number of tickets
        System.out.println("Total Booked Tickets: " + system.getTotalTickets());
    }

}
