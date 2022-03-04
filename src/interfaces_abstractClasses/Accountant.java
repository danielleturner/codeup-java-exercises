package interfaces_abstractClasses;

public class Accountant extends Employee{


    public Accountant(String name, String department) { // <--this constructor is from our parent class
        super(name, department);
    }

    public String work() {
        return "TPS Reports drafted!";
    }


    public String mourningMetting() {
        return "Accouantants have moringn meeting between 8:15 and 8:45";
    }


    public String lunchTime() {
        return "takes lunch from 1 to 2 pm or as requested and approved through accounting manager";
    }


    public int dailyPay() {
        return 500;
    }
}
