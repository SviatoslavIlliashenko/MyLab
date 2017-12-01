package lab_2_14.testGenerics2;

public class MyTestMethod<T extends Number> {

    static <T extends Number> int calculateNumber(T[] array, T maxElement) {
        int count = 0;

        for (T i : array) {

            if (i.doubleValue() > maxElement.doubleValue())
            {
                ++count;
            }
        }
        return count;
    }


    static <T extends Number> double calculateSum(T[] array, T maxElement) {
        double sum = Double.valueOf(0);
        for (T i : array) {
            if (i.doubleValue() > maxElement.doubleValue()) {
                sum+=i.doubleValue();
            }
        }
        return  sum;
    }
}