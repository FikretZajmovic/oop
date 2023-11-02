package week5.boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{
    private double maxWeight;
    private double currentWeight;

    public MaxWeightBox(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    @Override
    public void add(Thing thing) {
        if (currentWeight + thing.getWeight() <= maxWeight) {
            currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
