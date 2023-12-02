package javabasicproject1;

public class codingTask9 {
    //9. Write a java program to find the second largest number in the array?

    public static void main(String[] args) {
        int[] numbers = {15, 23, 99, 42, 7, 10, 18, 4, 36};


        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number in the Array is  "+secondLargest);

    }
}
