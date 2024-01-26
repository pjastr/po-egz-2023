package algorithm;

import java.util.ArrayList;

public class ItemManager<T>{
    private ArrayList<T> items;

    {
        items = new ArrayList<>();
    }

    public void addItem(T item){
        items.add(item);
    }

    public T getItem(int index){
        return items.get(index);
    }

    public int getItemCount(){
        return items.size();
    }
}
