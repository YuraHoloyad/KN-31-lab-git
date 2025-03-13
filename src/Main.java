import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputOrder();
    }


    public static void inputOrder() {
        try (Scanner scanner = new Scanner(System.in)) {

            String name = printItem(scanner, "Print a name of goods");
            double price = printPrice(scanner, "Print a price");
            String city = printItem(scanner, "Print a city");
            String customer = printItem(scanner, "Print a customer");
            String managerName = printItem(scanner, "Print a managerName");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String printItem(Scanner scanner, String output) {
        while (true) {
            try {
                System.out.println(output);
                if (scanner.hasNextDouble() || scanner.hasNextInt()) {
                    throw new Exception("Size must be a string.");
                }
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static double printPrice(Scanner scanner, String output) {
        while (true) {
            try {
                System.out.println(output);
                if (!scanner.hasNextDouble() && !scanner.hasNextInt()) {
                    scanner.nextLine();
                    throw new Exception("Size must be an integer or double.");
                }
                double answer = scanner.nextDouble();
                scanner.nextLine();
                return answer;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}