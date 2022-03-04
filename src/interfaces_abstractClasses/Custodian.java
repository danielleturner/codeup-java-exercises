package interfaces_abstractClasses;

public class Custodian extends Employee {


    public Custodian(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "Responsible for maintaining building!";
    }

    public String mourningMetting() {
        return "Have meeting with maintanace people and sets meetings as necessary";
    }

    public String lunchTime() {
        return "takes lunch from 11:00 to 12:00 ";
    }

    public int dailyPay() {
        return 100;
    }
}
