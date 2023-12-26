package Domain;

public class Animal {
    private double weight;
    private int id;

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    public Animal(double weight, int id)
    {
        this.weight = weight;
        this.id = id;
    }
}
