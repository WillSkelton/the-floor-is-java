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

    // Add Item
    public void addItem(String itemName, String desc) {

        ToDo.put(itemName, desc);
        this.length++;

        System.out.println(ToDo);
    }
}
