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

        System.out.print("Please Specify a name for your list: ");
        String listName = keyboard.next();

        List MyToDoList = createList(listName);

        System.out.println("Commands:");
        System.out.println("'add': add item to list\n"
            + "'delete': delete item\n"
            + "'check': check off item\n"
            + "'exit': exit\n"
            + "'show': shows list\n"
            + "'length': gets length");


        String choice = "";
        String itemName = "";
        String itemDesc = "";

        while(!choice.equalsIgnoreCase("exit")) {
            System.out.print("What do you want to do?: ");
            choice = keyboard.next();

            if (choice.equalsIgnoreCase("add")) {
                
                System.out.print("What Is the name of this item?: ");
                itemName = keyboard.next();

                System.out.print("What is this item's description?: ");
                itemDesc = keyboard.next();

                MyToDoList.addItem(itemName, itemDesc);
                continue;
            }
            // }
            // if (choice.equalsIgnoreCase('delete')) {
            //     MyFirstList.deleteItem();
            //     continue;
            // }
            // if (choice.equalsIgnoreCase('check')) {
            //     MyFirstList.checkItem();
            //     continue;
            // }
            // if (choice.equalsIgnoreCase('exit')) {
            //     break;
            // }
            // if (choice.equalsIgnoreCase('show')) {
            //     MyFirstList.showItem();
            //     continue;
            // }
            // if (choice.equalsIgnoreCase('length')) {
            //     MyFirstList.lengthItem();
            //     continue;
            // }

        }
    }

    public static void main(String[] args) {

        greeting();
        choice();

    }
}
