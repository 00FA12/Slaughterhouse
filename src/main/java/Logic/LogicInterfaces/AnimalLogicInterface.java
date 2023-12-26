package Logic.LogicInterfaces;

import Domain.Animal;
import Domain.AnimalPart;

import java.util.ArrayList;

public interface AnimalLogicInterface {
    public Animal createAnimal(double weight);
    public Animal getAnimal(int id);
    public ArrayList<AnimalPart> getAnimalParts(int animalId);
}
