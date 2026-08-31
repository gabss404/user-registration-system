import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== User Registration System ===");

        String name = readName(scanner);
        String documentId = readDocumentId(scanner);
        int age = readAge(scanner);
        double weight = readWeight(scanner);
        double height = readHeight(scanner);

        displayData(name, documentId, age, weight, height);

        scanner.close();
    }

    private static String readName(Scanner scanner) {
        System.out.print("Enter your full name: ");
        return scanner.nextLine();
    }

    private static String readDocumentId(Scanner scanner) {
        System.out.print("Enter your ID number: ");
        return scanner.nextLine();
    }

    private static int readAge(Scanner scanner) {
        System.out.print("Enter your age: ");
        return scanner.nextInt();
    }

    private static double readWeight(Scanner scanner) {
        System.out.print("Enter your weight (kg): ");
        return scanner.nextDouble();
    }

    private static double readHeight(Scanner scanner) {
        System.out.print("Enter your height (m): ");
        return scanner.nextDouble();
    }

    private static void displayData(String name, String documentId, int age, double weight, double height) {
        System.out.println("\n=== Registered Data ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + documentId);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
    }
}
    
