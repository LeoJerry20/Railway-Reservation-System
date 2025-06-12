package railwayReservationSystemByJustWriteCode;

import java.util.Scanner;


public class TicketBooking{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 TicketSystem ticketSystem=new TicketSystem();
	 while(true) {
	 System.out.println("Railway System Booking/n");
	 System.out.println("Select any one choice from List");
	 System.out.println("1. Book Ticket");
	 System.out.println("2. Cancel Ticket");
	 System.out.println("3. View Conformed Seat List");
	 System.out.println("4. View Available Seats");
	 System.out.println("5. View RAC Seat List");
	 System.out.println("6. View Waiting  seat List");
	 System.out.println("7. Exit");
	 int choice=sc.nextInt();
	 switch(choice) {
	 case 1:{
		 System.out.println("Enter Your Name : ");
		 String name=sc.next();
		 //sc.nextLine();
		 System.out.println("Enter your age : ");
		 int age=sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter Your Gender(Male/Female/other) : ");
		 String gender=sc.nextLine();
		 System.out.println("Enter your Berth Preference(L/U/M) : ");
		 String berth=sc.nextLine();
		 ticketSystem.bookTicket(name,age,gender,berth);
		 break;
	 }
	 case 2:{
		 int id=sc.nextInt();
		 ticketSystem.cancelTicket(id);
		 break;
	 }
	 case 3:{
		 ticketSystem.displayConformedList();
		 break;
	 }
	 case 4:{
		 ticketSystem.viewAvailableSeats();
		 break;
	 }	
	 case 5:{
		 ticketSystem.displayRacList();
		 break;
	 }
	 case 6:{
		 ticketSystem.displayWaitingList();
		 break;
	 }
	 case 7:{
		 System.out.println("Thank you.\n Exiting...");
		 System.exit(0);
	 }
	 default :{
		 System.out.println("Invalid Choice. Try Again");
	 }
	 }
	 }
	 
	}
}





























//public class TicketBooking {
//    public static void main(String[] args) {
//        TicketSystem ticketSystem = new TicketSystem();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\nRailway Booking System:");
//            System.out.println("1. Book Ticket");
//            System.out.println("2. Cancel Ticket");
//            System.out.println("3. View Confirmed Tickets");
//            System.out.println("4. View Available Tickets");
//            System.out.println("5. View RAC Tickets");
//            System.out.println("6. View Waiting List Tickets");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter Name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter Age: ");
//                    int age = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline
//                    System.out.print("Enter Gender (Male/Female): ");
//                    String gender = scanner.nextLine();
//                    System.out.print("Enter Berth Preference (L/U/M): ");
//                    String berthPreference = scanner.nextLine();
//                    ticketSystem.bookTicket(name, age, gender, berthPreference);
//                    break;
//                case 2:
//                    System.out.print("Enter Ticket ID to Cancel: ");
//                    String ticketId = scanner.nextLine();
//                    ticketSystem.cancelTicket(ticketId);
//                    break;
//                case 3:
//                    ticketSystem.printBookedTickets();
//                    break;
//                case 4:
//                    ticketSystem.printAvailableTickets();
//                    break;
//                case 5:
//                    ticketSystem.viewRacTickets();
//                    break;
//                case 6:
//                    ticketSystem.viewWaitingListTickets();
//                    break;
//                case 7:
//                    System.out.println("Exiting...");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Try again.");
//            }
//        }
//    }
//}
