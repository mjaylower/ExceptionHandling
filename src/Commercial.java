import java.util.Scanner;
// commercial class a child class of the customer class
// customer values information initiated customer class available for use
class Commercial extends Customer {

    Commercial() {
        // create local bool variable to be used for conditional testing
        boolean multi;
        Scanner scanner = new Scanner(System.in);

        // obtain customer information via user input
        System.out.println("Commercial");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Phone: ");
        phone = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Sq Ft: ");
        double footage = 0; // create local variable for parsing

        // created the do/while loop to continue to ask user for sq ft until valid number is entered
        // try/catch statement used to catch entry NOT as a valid number
        do {
            try {
                squareFootage = scanner.nextLine();
                footage = Double.parseDouble(squareFootage);
            } catch (NumberFormatException e) { // while entry is not numerical, exception will be raised
                System.out.println("Not a valid number"); // custom exception message
                System.out.println("Please enter valid Square Footage:"); // additional exception message
            }
        }
        while (footage == 0); // while footage equals zero, loop will continue to run

        do {
            System.out.println("Multi Property Discount (T/F): ");
            multiDiscount = scanner.nextLine();
        }
        while (!"T".equals(multiDiscount) && !"t".equals(multiDiscount) && !"F".equals(multiDiscount) && !"f".equals(multiDiscount));


        /*create if/else condition testing for purpose of calculating weekly rate
        check the user input for senior rate to match case and convert to boolean and run testing*/
        if (multiDiscount.substring(0, 1).equals("T") || multiDiscount.substring(0, 1).equals("t")) {
            multi = true;
        } else {
            multi = false;
        }

        // pass local values to commercial class only through to the calculateCharges method
        calculateCharges(multi, footage);
    }

    // accept the passed values of local variables and assign as needed
    private void calculateCharges(boolean multi, double footage) {
        double weeklyRate; // created local variable to establish weekly payment rates
        if (!multi) { // create if/else condition testing for discount
            weeklyRate = footage * .005; // calculate weekly rate with no discount
        } else {
            weeklyRate = (footage * .005) - ((footage * .005) * .1); // calculate weekly rate with 10% discount
        }

        // pass all values back to the Customer class to be ran through the display method
        Customer.display(name, phone, address, footage, multi, weeklyRate);

    }
}
