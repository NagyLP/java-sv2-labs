package references.dogs;

public class Dog {

    public String name;
    public int age;
    public String clour;

    public Dog(String name, int age, String clour) {
        this.name = name;
        this.age = age;
        this.clour = clour;
    }

    @Override
    public String toString() {
        return "- Kutyuli -\n" +
                "Neve: '" + name + '\'' + "\n"+
                "Kor a: " + age +"\n"+
                "Szín-e: " + clour+"\n";}

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setClour(String clour) {
        this.clour = clour;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getClour(String s) {
        return clour;
    }
}
