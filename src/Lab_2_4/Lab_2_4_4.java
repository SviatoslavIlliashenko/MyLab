package Lab_2_4;

public class Lab_2_4_4 {


    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        System.out.println(Employee.getNumberOfEmployees());

    }
}

class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private int telephone;
    private static int numberOfEmployees;


    public Employee() {
        //this.firstName=firstName;
        numberOfEmployees++;
    }


    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}