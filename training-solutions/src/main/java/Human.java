public class Human {

    private String name;
    private int age;

    public Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAgege() {return age;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    public String getInfo() {return "Név: " +name+ " ; " +" Kor: " +age;}
}


