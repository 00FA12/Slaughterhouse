package Domain;

public class AnimalPart
{
    private int id;
    private Animal originAnimal;
    private String type;
    private double weight;

    public AnimalPart(int id, Animal originAnimal, String type, double weight)
    {
        this.id = id;
        this.originAnimal = originAnimal;
        this.type = type;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public Animal getOriginAnimal() {
        return originAnimal;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
