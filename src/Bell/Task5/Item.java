package Bell.Task5;

import java.util.Objects;

public class Item {
    int weight;
    int cost;
    String name;

    public Item(int weight, int cost, String name) {
        this.weight = weight;
        this.cost = cost;
        this.name = name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item  = (Item) o;
        return weight == item.weight &&
                Objects.equals(cost, item.cost);
    }

    public static void main(String[] args) {
        Item item1 = new Item(12, 1200, "FirstItem");
        Item item2 = new Item(12, 1200, "SecondtItem");


        System.out.println(item1.equals(item2));
    }
}
