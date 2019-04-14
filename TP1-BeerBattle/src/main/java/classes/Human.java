package classes;


import interfaces.IToDrink;
import interfaces.IToPee;

public class Human {
    private String name;
    private int age;
    private int weight;
    private int drinkedBeer;
    private IToDrink toDrink;
    private IToPee toPee;

    public Human(String name, int age, int weight, int drinkedBeer, IToDrink toDrink, IToPee toPee) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.drinkedBeer = drinkedBeer;
        this.toDrink = toDrink;
        this.toPee = toPee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getDrinkedBeer() {
        return drinkedBeer;
    }

    public void setDrinkedBeer(int drinkedBeer) {
        this.drinkedBeer = drinkedBeer;
    }

    public IToDrink getToDrink() {
        return toDrink;
    }

    public void setToDrink(IToDrink toDrink) {
        this.toDrink = toDrink;
    }

    public IToPee getToPee() {
        return toPee;
    }

    public void setToPee(IToPee toPee) {
        this.toPee = toPee;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", drinkedBeer=" + drinkedBeer +
//                ", toDrink=" + toDrink +
//                ", toPee=" + toPee +
                '}';
    }
}
