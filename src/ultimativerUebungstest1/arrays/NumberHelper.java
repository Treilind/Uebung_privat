package ultimativerUebungstest1.arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,4};

        System.out.println(isSortedArray(numbers));
        System.out.println(Arrays.toString(removeDuplicates(numbers)));
    }

    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if(i == numbers.length-1){
                return true;
            }
            if(numbers[i] > numbers[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length-1; j++) {
                if(numbers[i] == numbers[j+1]){
                    numbers[j+1] = -1;
                }
            }
        }
        return numbers;
    }

}
