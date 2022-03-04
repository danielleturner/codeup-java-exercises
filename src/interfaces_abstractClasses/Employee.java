package interfaces_abstractClasses;

public abstract class Employee implements dailyWork { // <-- here i can bring in interfaces by typing in implements and name of interface
    // I need some fields!
    protected String name;
    protected String department;

    //---Constructor---//
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }


    //---Getter---//
    public String getName() {
        return name;
    }

    //---Setter---//
    public void setName(String name) {
        this.name = name;
    }

    //---Getter---//
    public String getDepartment() {
        return department;
    }

    //---Setter---//
    public void setDepartment(String department) {
        this.department = department;
    }

//    public abstract String work();
}
