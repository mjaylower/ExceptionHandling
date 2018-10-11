import java.util.Scanner;

import static javafx.application.Platform.exit;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // display menu of choices
        System.out.println("What type of customer?");
        System.out.println("1: Residential");
        System.out.println("2: Commercial");
        System.out.println("3: Exit");

        // initiate the choice variable to make selection
        // using a string initially so that I can easily compare stings to validate selection
        // once valid selection is made, string will parse to int for switch case
        String choice =  scanner.nextLine();

        // while the choice isn't a menu option, ask for a valid number 1, 2 or 3
        // program will continue to ask for valid number 1, 2, or 3
        while (!"1".equals(choice) & !"2".equals(choice) & !"3".equals(choice)) {
            System.out.println("Please enter a valid number");
            choice = scanner.nextLine();
        }
        // menu selection now valid will be parsed to int for switch case
        int choiceInt = Integer.parseInt(choice);

        // new int variable can be passed through the switch statements to determine correct class
            switch (choiceInt) {
                case 1: new Residential(); //if 1 - run residential class
                break;

                case 2: new Commercial(); // if 2 - run commercial class
                break;

                case 3: System.out.println("Goodbye"); exit(); // if 3 - exit program
                break;
            }
        }
    }

