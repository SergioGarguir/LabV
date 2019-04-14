package classes;

import interfaces.IToDrink;
import interfaces.IToPee;

public class Spartan extends Human {
    private int extraTolerance;

    public Spartan(String name, int age, int weight, int drinkedBeer, IToDrink toDrink, IToPee toPee, int extraTolerance) {
        super(name, age, weight, drinkedBeer, toDrink, toPee);
        this.extraTolerance = extraTolerance;
    }

    public int getExtraTolerance() {
        return extraTolerance;
    }

    public void setExtraTolerance(int extraTolerance) {
        this.extraTolerance = extraTolerance;
    }

    @Override
    public String toString() {
        return "\nSpartan{" + super.toString() +
                "extraTolerance=" + extraTolerance +
                '}';
    }
}
