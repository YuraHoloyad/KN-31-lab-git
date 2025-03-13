import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printMainConsoleMenu();
    }

    public static void printMainConsoleMenu (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Print all orders");
        System.out.println("2 - Create order");
        System.out.println("3 - Delete order");
        System.out.println("4 - Save orders");
        int option = 0;
        try  {
            option = scanner.nextInt();
        }
        catch (InputMismatchException exception)  {
            System.err.println("InputMismatchException");
        }
        for ( ; ; ) {
            if (option >= 1 && option <= 4) {
                switch (option) {
                    case 1:
                        printAllOrders();
                        break;
                    case 2:
                        createOrder();
                        break;
                    case 3:
                        deleteOrder();
                        break;
                    case 4:
                        saveOrders();
                        break;
                }
                break;
            } else {
                System.out.println("Invalid option. Try again");
                printMainConsoleMenu();
                break;
            }
        }

        scanner.close();
    }



    public static void printAllOrders() {
        System.out.println("printAllOrders");
    }

    public static void createOrder () {
        System.out.println("createOrder");
    }

    public static void deleteOrder () {
        System.out.println("deleteOrder");
    }

    public static void saveOrders () {
        System.out.println("saveOrders");
    }

}