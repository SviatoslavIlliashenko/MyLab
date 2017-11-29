package lab_2_12.textNested2;

public class MyTestClass {

    //  MyStaticNested myStaticNested = new MyStaticNested();
    // MyInner myInner = new MyInner();


    void test() {
    }


    static class MyStaticNested {
        private static int x = 1;

        static int MyStaticNestedMetod() {
            return x * x;
        }
    }


    class MyInner {
        private int y = 2;

        int MyInnerMethod() {
            return y * y;
        }


    }


    void myMethod() {

        class MyLocal {
            int z = 3;

            int MyLocalMethod() {
                return z * z;
            }
        }

    }
}