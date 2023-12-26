package Domain;

import java.util.ArrayList;

public class Distribution {
    private ArrayList<AnimalPart> animalParts;
    private String packageName;

    public Distribution(String packageName)
    {
        this.packageName = packageName;
    }

    public void addAnimalPart(AnimalPart animalPart) {
        animalParts.add(animalPart);
    }
    public void deleteAnimalPart(int animalPartId)
    {
        animalParts.remove(animalPartId);
    }

    public String getPackageName() {
        return packageName;
    }

    public ArrayList<AnimalPart> getAnimalParts() {
        return animalParts;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
