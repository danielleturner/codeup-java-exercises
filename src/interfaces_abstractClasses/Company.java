package interfaces_abstractClasses;

public class Company {

    public static void main(String[] args){

        Employee numberBot = new Accountant("accountatBot", "Accounting");
        Employee cleanerBot = new Custodian("cleanerBot", "Maintainance");

        System.out.println("numberBot.work() = " + numberBot.work());
        System.out.println("numberBot.work() = " + numberBot.getName());
        System.out.println("numberBot = " + numberBot.lunchTime());
        System.out.println("numberBot = " + numberBot.dailyPay());
        System.out.println();

        System.out.println("cleanerBot.work() = " + cleanerBot.work());
        System.out.println("cleanerBot.work() = " + cleanerBot.getName());
        System.out.println("cleanerBot.work() = " + cleanerBot.lunchTime());
        System.out.println("cleanerBot.work() = " + cleanerBot.dailyPay());
        System.out.println();


        System.out.println("cleanerBot.getDepartment() = " + cleanerBot.getDepartment());
        System.out.println("numberBot.getDepartment() = " + numberBot.getDepartment());

    }
}
