import java.util.Scanner;

public class ToDo {

    public static void greeting() {
        System.out.println("Welcome to the Will Skelton ToDo App. Exactly 1 puppy was killed in the making of this program.");

    }

    public static List createList(String listName) {
        List MyToDoList = new List(listName);
        return MyToDoList;
    }

    public static void choice() {
        Scanner keyboard = new Scanner(System.in);

        // Gets name of list
        System.out.print("Please Specify a name for your list: ");
        String listName = keyboard.nextLine();

        // Makes new List with user input
        List MyToDoList = createList(listName);

        // Shows vaid commands
        System.out.println("Commands:");
        System.out.println("'add': add item to list\n"
            + "'delete': delete item\n"
            + "'show': shows list\n"
            + "'length': gets length\n"
            + "'help': shows commands\n"
            + "'exit': exit");

        // Preps for Command Loop
        String choice = "";
        String itemName = "";
        String itemDesc = "";

        // Command loop
        while(!choice.equalsIgnoreCase("exit")) {
            System.out.print(">>>: ");
            choice = keyboard.nextLine();

            // add item
            if (choice.equalsIgnoreCase("add")) {

                // Get Item Name
                System.out.print("What is the name of this item?: ");
                itemName = keyboard.nextLine();

                // Get Item Desc
                System.out.print("What is this item's description?: ");
                itemDesc = keyboard.nextLine();

                // Create new item
                MyToDoList.addItem(itemName, itemDesc);

                // Reset Choice
                choice = "";
                continue;
            }

            // Delete Item
            if (choice.equalsIgnoreCase("delete")) {
                System.out.print("What is the name of the item do you want to delete?: ");
                itemName = keyboard.nextLine();

                MyToDoList.deleteItem(itemName);

                choice = "";
                continue;
            }

            if (choice.equalsIgnoreCase("show")) {
                MyToDoList.showAllItems();

                choice = "";
                continue;
            }

            if (choice.equalsIgnoreCase("length")){
                System.out.println(MyToDoList.getLength());

                choice = "";
                continue;
            }

            if (choice.equalsIgnoreCase("help")){
                System.out.println("====================================");

                System.out.println("Commands:");
                System.out.println("'add': add item to list\n"
                    + "'delete': delete item\n"
                    + "'show': shows list\n"
                    + "'length': gets length\n"
                    + "'help': shows commands\n"
                    + "'exit': exit");

                System.out.println("====================================");

                choice = "";
                continue;
            }

            if (choice.equalsIgnoreCase("exit")){
                System.out.println("Bye!");
                choice = "";
                break;
            }
            
            System.out.println("ERROR: NOT A VALID COMMAND");


        }
    }

    public static void main(String[] args) {

        greeting();
        choice();

        // Scanner keyboard = new Scanner(System.in);
        //
        // String num1;
        // String num2;
        //
        // System.out.print("Num1: ");
        // num1 = keyboard.nextLine();
        //
        //
        // System.out.print("Num2: ");
        // num2 = keyboard.nextLine();
        //
        // System.out.println("Num1: " + num1);
        // System.out.println("Num2: " + num2);

    }
}
