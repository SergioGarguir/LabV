package classes;

import interfaces.IToDrink;
import interfaces.IToPee;

public class Viking extends Human {
    private int professionalDrinker;

    public Viking(String name, int age, int weight, int drinkedBeer, IToDrink toDrink, IToPee toPee, int professionalDrinker) {
        super(name, age, weight, drinkedBeer, toDrink, toPee);
        this.professionalDrinker = professionalDrinker;
    }

    public int getProfessionalDrinker() {
        return professionalDrinker;
    }

    public void setProfessionalDrinker(int professionalDrinker) {
        this.professionalDrinker = professionalDrinker;
    }

    @Override
    public String toString() {
        return "\nViking{" + super.toString() +
                "professionalDrinker=" + professionalDrinker +
                '}';
    }
}

