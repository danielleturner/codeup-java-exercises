package practice_projects;

public class SoundTravel {

    public static void main(String[] args) {

        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lightning is " + dist + " feet away.");

        echoback();

    }

    public static void echoback(){

        double echo;

        echo = 20 / 2;
        System.out.println("The time it takes sound to travel to the wall is: " + echo);
    }
}
