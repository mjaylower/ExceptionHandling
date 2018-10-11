import java.text.DecimalFormat;
import java.text.NumberFormat;

class Customer {

    // initiate all values being used in program by both res and comm
    String name;
    String phone;
    String address;
    String squareFootage;
    String seniorRate;
    String multiDiscount;

    // create the display method to show data that was entered passed on via each class

    static void display(String name, String phone, String address, double footage, boolean discount, double rate) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        DecimalFormat df =  new DecimalFormat("#,###.##");


        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Square Footage: " + df.format(footage) + " sq.ft.");
        System.out.println("Discount: " + discount);
        System.out.println("Weekly Rate: " + currency.format(rate));
    }
}
