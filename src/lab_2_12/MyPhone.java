package lab_2_12;

import java.util.Arrays;
import java.util.Comparator;

class MyPhone {


    MyPhoneBook myPhoneBook = new MyPhoneBook();

    void switchOn() {
        System.out.println("Loading PhoneBook records…OK");
        myPhoneBook.addPhoneNumber("Ben", "1111");
        myPhoneBook.addPhoneNumber("Anna", "2222");
        myPhoneBook.addPhoneNumber("Gimy", "3333");
        myPhoneBook.addPhoneNumber("Ivan", "4444");
        myPhoneBook.addPhoneNumber("Lili", "5555");
        myPhoneBook.addPhoneNumber("Tom", "6666");
        myPhoneBook.addPhoneNumber("Jenny", "7777");
        myPhoneBook.addPhoneNumber("Mariya", "8888");
        myPhoneBook.addPhoneNumber("Oleg", "9999");
        myPhoneBook.addPhoneNumber("Olena", "1010");
    }


    void call(int index) {

        System.out.println("Calling to" + myPhoneBook.phoneNumbers[index]);

    }

    ///////////////////////////////
    class Camera {
    }

    class Bluetooth {
    }

    class MemoryCard {
    }

    class SimCard {
    }

    class PowerOnButton {
    }

    class HeadPhones {
    }

    class PhoneBattery {
    }

    class PhoneCharger {
    }

    class PhoneDisplay {
    }

    class PhoneSpeaker {
    }

    /////////////////////////////////////


    class MyPhoneBook {

        private int tmp;
        private final int size = 10;

        PhoneNumber[] phoneNumbers = new PhoneNumber[size];

        void addPhoneNumber(String name, String phone) {

            if (tmp < size) {
                phoneNumbers[tmp++] = new PhoneNumber(name, phone);
            }
        }

        void printPhoneBook() {

            for (PhoneNumber i : phoneNumbers) {
                System.out.println(i);
            }
        }

        void sortByName() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
        }

        void sortByPhone() {
            Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
                @Override
                public int compare(PhoneNumber o1, PhoneNumber o2) {
                    return o1.getPhone().compareTo(o2.getPhone());
                }
            });
        }


        //--------------------------------------------------------------------------------------------------------------------
        class PhoneNumber {

            private String name;
            private String phone;

            PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            String getName() {
                return name;
            }

            String getPhone() {
                return phone;
            }

            @Override
            public String toString() {
                return "PhoneNumber{" +
                        "name='" + name + '\'' +
                        ", phone='" + phone + '\'' +
                        '}';
            }
        }


    }


}