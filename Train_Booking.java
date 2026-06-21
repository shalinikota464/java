import java.util.Scanner;

public class Train_Booking {

    static String Seats[][] = new String[10][4];

    static void View() {
        System.out.println("\nTrain Seat Status:\n");

        for (int i = 0; i < 10; i++) {
            System.out.print("Row " + (i + 1) + " : ");

            for (int j = 0; j < 4; j++) {
                System.out.print(Seats[i][j] + "  ");
            }
            System.out.println("\n");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to book a ticket (Yes/No): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            Booking();
        } else {
            System.out.println("Thank you for visiting.");
        }
    }

    static void Booking() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Row Number (1-10): ");
        int row = sc.nextInt() - 1;

        System.out.print("Enter Seat Number (1-4): ");
        int col = sc.nextInt() - 1;

        if (row >= 0 && row < 10 && col >= 0 && col < 4) {

            if (Seats[row][col].equals("Available")) {
                Seats[row][col] = "Booked";
                System.out.println("Ticket Booked Successfully.");
            } else {
                System.out.println("Seat Already Booked.");
            }

        } else {
            System.out.println("Invalid Seat Number.");
        }

        View();
    }

    Train_Booking() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                Seats[i][j] = "Available";
            }
        }
    }

    public static void main(String[] args) {

        new Train_Booking();

        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to Train Ticket Booking\n");
        System.out.print("Do you want to book tickets (Yes/No): ");

        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Yes")) {
            View();
        } else {
            System.out.println("Thank you for visiting.");
        }
    }
}