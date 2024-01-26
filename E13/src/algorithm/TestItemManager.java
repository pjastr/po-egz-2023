package algorithm;

public class TestItemManager {

    public static void main(String[] args) {
        ItemManager<String> itemManager = new ItemManager<>();
        itemManager.addItem("Hello");
        itemManager.addItem("World");
        System.out.println(itemManager.getItem(0));
        System.out.println(itemManager.getItem(1));
        System.out.println(itemManager.getItemCount());
    }
}
