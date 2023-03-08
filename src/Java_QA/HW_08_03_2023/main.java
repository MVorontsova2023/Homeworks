package HW_08_03_2023;

public class main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Marina Vorontsova";
        person1.age = 20;
        person1.talk();

        Person person2 = new Person("Marina Vorontsova", 20);
        person2.talk();

        Phone phone1 = new Phone();
        phone1.number = "100";
        phone1.receiveCall("Caller1");
        phone1.getNumber();

        Phone phone2 = new Phone();
        phone2.number = "200";
        phone2.receiveCall("Caller2");
        phone2.getNumber();

        Phone phone3 = new Phone();
        phone3.number = "300";
        phone3.receiveCall("Caller3");
        phone3.getNumber();

        Doctor doctor = new Doctor();
        doctor.work();

        Policeman policeman = new Policeman();
        policeman.work();

        Fireman fireman = new Fireman();
        fireman.work();
    }
}