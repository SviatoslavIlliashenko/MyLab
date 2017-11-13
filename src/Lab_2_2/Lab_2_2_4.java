package Lab_2_2;

public class Lab_2_2_4 {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setPerson(34562, "Q");
        person1.setPerson("P");
        person1.setPerson(1242432,"K");
        person1.setPerson(123132114,"W");
        person1.setPerson("Tom","Tomson",26,"man",2341);

        System.out.println(person1.toString());

    }
}

class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private int phoneNumber;


    public void setPerson(String firstName) {
        this.firstName = firstName;
    }

    public void setPerson(String firstName, int age, int phoneNumber) {
        this.age = age;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;

    }


    public void setPerson(int phoneNumber, String lastName) {
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }


    public void setPerson(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }


    public void setPerson(String firstName, String lastName, int age, String gender, int phoneNumber) {
        this.age = age;
        this.firstName = firstName;
        this.gender = gender;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    @Override

    public String toString() {

        return ("First name : " + firstName + "\nLast name : " + lastName + "\nAge : " + age + "\nGender : " + gender + "\nPhone number : " + phoneNumber);

    }
}


