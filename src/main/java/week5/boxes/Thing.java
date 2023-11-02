package week5.boxes;

import week5.ToBeStored;

import java.util.Objects;

public class Thing {
    private String name;
    private double weight;

    public Thing(String name, double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight cannot be negative.");
        }
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(name, ((Thing) o).name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
