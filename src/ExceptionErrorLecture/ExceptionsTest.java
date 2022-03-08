package ExceptionErrorLecture;

public class ExceptionsTest {

    public static void main(String[] args) throws Exception {

//        System.out.println("\"If I am above the eception will i be seen\" = " + "If I am above the exception will i be seen"); // <-- can see because the statement is about the statment code runs until it hits the exceptioin
//
//        throw new Exception("Woops -Eception encountered"); // <--- from this point on no code will be seen.
//        System.out.println("Good morning, Sirius");       // <-- this will break the code not allowing it to run

        // Try catch Method
        // Okay - that's an interesting experiment that show an exception breaking a program and how it breaks, but how would I start to work around exceptions?

        try{
            // Code to break application here. .
            throw new NullPointerException("Something broke while running the application!");
        } catch (NullPointerException exceptionObject){ // <-- most specific
            System.out.println("This is a null pointer exception");
            System.out.println("Here's an example of .getMessage() " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (RuntimeException exceptionObject){ // <-- less specific
            System.out.println("This is a runtime exception");
            System.out.println("exceptionObject.getMessage() = " + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (Exception exceptionObjects){ // <-- general exception
            System.out.println("this is a generic, to plevel exception");
            System.out.println("Here is an example of .getMessage()"  + exceptionObjects.getMessage());
        } finally {
            System.out.println("This statement will always run!"); //<-- this statement will always run
        }
    }
}
