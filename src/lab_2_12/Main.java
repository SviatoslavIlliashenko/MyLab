package lab_2_12;



public class Main {

    public static void main(String[] args) {




        MyPhone myPhone = new MyPhone();

        myPhone.switchOn();

        myPhone.myPhoneBook.printPhoneBook();

        System.out.println();

        myPhone.call(1);

        myPhone.myPhoneBook.sortByName();
        myPhone.myPhoneBook.sortByPhone();
    }
}