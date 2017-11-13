package Lab_2_2;

public class Lab_2_2_3 {
    public static void main(String[] args){

        Employee employee1 = new Employee();
        employee1.calculateSalary("Tom",3000,4500,2300);

    }

}

class Employee{

    public void calculateSalary(String name, double... salary) {

        double totalSalary = 0;

        for (double x : salary) {

            totalSalary += x;

        }

        System.out.println("Name : " + name);
        System.out.println("Total salary : " + totalSalary);
    }

}





