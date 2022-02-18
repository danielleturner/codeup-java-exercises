package practice_projects;

public class SwitchStatement {

    public static void main(String[] args) {
        int i;

        for (i = 0; i < 5; i++)
//        for (i = 0; i < 10; i++)
//            switch (i) // switch statement allows a variable to be printed with statement default message even though it is not defined in as a case
//            {
//                case 0:
//                    System.out.println("i is zero");
//                    break;
//                case 1:
//                    System.out.println("i is one");
//                    break;
//                case 2:
//                    System.out.println("i is two");
//                    break;
//                case 3:
//                    System.out.println("is is three");
//                    break;
//                case 4:
//                    System.out.println("is is four");
//                    break;
//                default:
//                    System.out.println("i is five or more");
//            }
            switch (i)
            {
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
                case 4:
                    System.out.println("i is less than five");
                    System.out.println();
            }

    }
}
