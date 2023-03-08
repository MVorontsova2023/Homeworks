package HW_08_03_2023;

public class Person {
    String fullName ="Marina Vorontsova";
    int age = 20;
    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    void move(){
        System.out.println(fullName + " говорит");
    }
    void talk() {
        System.out.println(fullName + " говорит");
    }
}
