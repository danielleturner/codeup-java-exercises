package InClassAssignments;

public class StringExercise {

    public static void main(String[] args) {

        String str1 = "We don't need no education\n" + // --> \n indicates a line break and then subsequently  places the rest of the sentence on the next line
                "We don't need no thought control";
        System.out.println(str1);

        String str2 = "In windows, the main drive is usually C:\\";

        String str3 = "Check \"this\" out!, \"s inside of \"s!"; // --> \" allows quotations to be used inside of a string
        System.out.println(str2);

        String str4 = "I can do backslashes \\, double backslashes \\\\,\n" + // --> \ backslashes just allow you to use the backslashes in the string
                "and the amazing triple backslash \\\\\\!";
        System.out.println(str3);
    }
}
