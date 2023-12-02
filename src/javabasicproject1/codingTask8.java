package javabasicproject1;

public class codingTask8 {
    //8. Maximum and minimum number in the array?

    public static void main(String[] args) {


        int[] numbers = {15, 23, 99, 42, 7, 10, 18, 4, 36};


        int max = numbers[0];
        int min = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        System.out.println("The Array max number is " + max);
        System.out.println("The Array min number is " + min);
    }

}
