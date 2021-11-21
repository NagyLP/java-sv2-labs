package introexceptionmoreexceptions;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);

        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase());

        System.out.println("Ez már le sem fut, mert előzóleg, egy üres objektum tartalmára formázó metódus meghívását (ObjektumOrientálatlannak) érthetetlennek véli. - NullPointerExeption");
    }

}
