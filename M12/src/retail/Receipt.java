package retail;

import java.util.ArrayList;

public class Receipt implements Cloneable{

    private String number;

    private ArrayList<Double> amounts;

    public Receipt(String number, ArrayList<Double> amounts) {
        this.number = number;
        this.amounts = new ArrayList<>(amounts);
    }

    public Receipt(){
        this.number = "AA";
        this.amounts = new ArrayList<>();

    }

    @Override
    public Receipt clone() throws CloneNotSupportedException{
        Receipt clone = (Receipt) super.clone();
        clone.amounts = new ArrayList<>(amounts);
        return  clone;
    }

    public void change(Double newValue){
        amounts.set(0, newValue);
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "number='" + number + '\'' +
                ", amounts=" + amounts +
                '}';
    }
}
