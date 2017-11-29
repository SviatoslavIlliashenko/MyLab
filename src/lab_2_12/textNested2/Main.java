package lab_2_12.textNested2;

public class Main {
    public static void main(String[] args) {
//MyTestClass myTestClass=new MyTestClass();
        //    MyTestClass.MyInner myInner=myTestClass.new MyInner();

        MyTestClass myTestClass = new MyTestClass();
       // MyTestClass.MyInner myInner = myTestClass.new MyInner();

      //  MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();



        myTestClass.test();

        myTestClass.myMethod();

        MyTestClass.MyStaticNested.MyStaticNestedMetod();



    }
}
