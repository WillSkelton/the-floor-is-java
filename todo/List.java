import java.util.*;
public class List {

    // Properties
    public String name;
    public int length;

    private Map<String, String> ToDo;

    // CTOR
    public List(String listName) {
        this.name = listName;
        this.length = 0;

        this.ToDo = new HashMap<String, String>();
    }

    // Add item
    public void addItem(String itemName, String desc) {
        ToDo.put(itemName, desc);
        this.length++;
    }

    // Remove item
    public void deleteItem(String itemName) {
        ToDo.remove(itemName);
        this.length--;
    }

    // Show all items
    public void showAllItems() {

        Set <String> keys = ToDo.keySet();

        String header = "========== " + this.name + ": ==========";
        String footer = "";
        String divider = "";

        for (int i = 0; i < header.length(); i++) {
            footer += "=";
            divider += "-";
        }

        System.out.println(header);

        for(String key : keys) {
            System.out.println("Item: " + key);
            System.out.println("Description: " + ToDo.get(key));
            System.out.println(divider);
        }

        System.out.println(footer);
    }

    public int getLength() {
        return this.length;
    }
}
