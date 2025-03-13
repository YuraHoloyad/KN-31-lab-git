import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputOrder();
    }

    public static void inputOrder() {
        try (Scanner scanner = new Scanner(System.in)) {

            String name = printData(scanner, "Print a name of goods");
            double price = printPrice(scanner, "Print a price");
            String city = printData(scanner, "Print a city");
            String customer = printData(scanner, "Print a customer");
            String managerName = printData(scanner, "Print a managerName");

            Order order = new Order(name, managerName, price, city, customer);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String printData(Scanner scanner, String output) {
        while (true) {
            try {
                System.out.println(output);
                if (scanner.hasNextDouble() || scanner.hasNextInt()) {
                    throw new Exception("Data must be a string.");
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
                    throw new Exception("Data must be an integer or double.");
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
