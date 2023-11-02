package week5.boxes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Box {
    public abstract void add(Thing thing);

    public void add(Collection<Thing> things)
    {
        for(Thing thing : things)
        {
            add(thing);
        }
    }
    public abstract boolean isInTheBox(Thing thing);
}

/*
    private double maximumWeight;
    private List<ToBeStored> items;

    public Box(double maximumWeight)
    {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    public void addItems(ToBeStored item)
    {
        if(this.weight() + item.weight() <= maximumWeight)
        {
            this.items.add(item);
        }
    }
    public double weight() {
        double totalWeight = 0;
        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }
    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
 */
