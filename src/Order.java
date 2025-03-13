public class Order {
    String itemName;
    String managerName;
    double prise;
    String city;
    String customer;

    public Order(String itemName, String managerName, double prise, String city, String customer) {
        this.itemName = itemName;
        this.managerName = managerName;
        this.prise = prise;
        this.city = city;
        this.customer = customer;
    }
}