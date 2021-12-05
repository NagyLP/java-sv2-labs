package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animalList;

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> animalsLegsList = new ArrayList<>();
        for (Animal item : animalList) {
            if (item.getNumberOfLegs() == numberOfLegs) {
                addAnimal(item);
            }
        }
        return animalsLegsList;
    }

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
