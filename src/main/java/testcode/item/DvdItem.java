package testcode.item;

import java.util.Map;

public class DvdItem implements Item {

    String name;
    int price;
    Map<Integer, String> trackInfo;
    
    public DvdItem(String name, int price) {
        super();
        this.name = name;
        this.price = price;
    }

    static Item of(String name, int price) {
        return new DvdItem(name, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
