package HW_08_03_2023;

public class Phone {
    String number;
    int model, weight;
    void receiveCall(String callerName) {
        System.out.printf("Звонит %s\n", callerName);
    }
    void getNumber() {
        System.out.printf("Номер телефона %s\n", number);
    }
}
