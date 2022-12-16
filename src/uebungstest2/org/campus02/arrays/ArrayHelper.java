package uebungstest2.org.campus02.arrays;

public class ArrayHelper {

    public static void main(String[] args) {
        int[] numbers = {3,6,4,8,2,1};

        arrangeOrder(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void arrangeOrder (int[] numbers){

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = 0;

                if (numbers[i] > numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }

    }

}
