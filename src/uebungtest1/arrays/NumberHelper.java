package uebungtest1.arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] numbers = {1,5,3,1,9,2,5};

        System.out.println(NumberHelper.isSortedArray(numbers));
        System.out.println(Arrays.toString(removeDuplicates(numbers)));


    }


    public static boolean isSortedArray(int[] numbers) {

        if (numbers.length >= 2) {
            for (int i = 0; i < numbers.length-1; i++) {
                if (!(numbers[i] <= numbers[i+1])) {
                    return false;
                }

            }
            return true;
        }

        return false;
    }

    public static int[] removeDuplicates(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length-1; j++) {
                if (numbers[i] == numbers[j+1]){
                    numbers[j+1] = -1;
                }
            }

        }



        return numbers;
    }

}


