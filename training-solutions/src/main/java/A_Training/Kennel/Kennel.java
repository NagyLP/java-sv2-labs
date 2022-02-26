package A_Training.Kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    List<Dog> dogs = new ArrayList<>();

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void feedAll() {
        dogs.forEach(Dog::feed);
    }

//    public void feedAllClassic() {
//        for (Dog dog : dogs) {
//            dog.feed();
//        }
//    }

    public Dog findByName(String name) {
        return dogs.stream()
                .filter(dog -> dog.getName().equals(name))
                .findAny()
                .orElseThrow(()
                        -> new IllegalArgumentException("Not fund dog whith Name: " + name));
    }

    public Dog findByNameClassic(String name) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                return dog;
            }
        }
        throw new IllegalArgumentException
                ("Not fund dog with name: " + name);
    }

    public void playWith(String name, int hours) {
        this.findByName(name).play(hours);
    }

    public List<String> getHappyDogNames(int minHappiness) {
        List<String> happyDogNames = new ArrayList<>();
        for (Dog dog : dogs) {
            if (dog.getHappiness() > minHappiness) {
                happyDogNames.add(dog.getName());
            }
        }
        return happyDogNames;
    }

}
