package lesson9.Mentor.Restoran;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Kabab name: ");
        String kababName = scanner.nextLine();
        System.out.println("Enter Kabab price: ");
        double kababPrice = scanner.nextDouble();

        System.out.println("Enter Meze name: ");
        scanner.nextLine(); // Consume newline
        String mezeName = scanner.nextLine();
        System.out.println("Enter Meze price: ");
        double mezePrice = scanner.nextDouble();

        System.out.println("Enter Ichki name: ");
        scanner.nextLine(); // Consume newline
        String ichkiName = scanner.nextLine();
        System.out.println("Enter Ichki price: ");
        double ichkiPrice = scanner.nextDouble();

        Kabab kabab = new Kabab(kababName, kababPrice);
        Meze meze = new Meze(mezeName, mezePrice);
        Ichki ichki = new Ichki(ichkiName, ichkiPrice);

        Menu menu = new Menu(kabab, meze, ichki);

        System.out.println("Total Price of the Menu: $" + menu.calculateTotalPrice());
    }
}
