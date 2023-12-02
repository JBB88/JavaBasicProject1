package javabasicproject1;

public class codingTask4 {
    //4. Create a 2D array of integers. Develop a program which will calculate the
    //sum of even and odd numbers for that array.

    public static void main(String[] args) {
        int[][] numArray = {
                {1, 8, 26, 15, 56},
                {12, 8, 29, 88, 56},
                {1, 81, 9, 28, 13}
        };

        int oddSum =0;
        int evenSum=0;

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                if (numArray[i][j] % 2 == 0) {
                    evenSum=evenSum+numArray[i][j];

                }else {
                    oddSum=oddSum+numArray[i][j];

                }
            }
        }

        System.out.println("The sum of even numbers is :"+evenSum);

        System.out.println("The sum of odd numbers is :"+oddSum);

        System.out.println("Total Sum of the Even and Odd :"+(evenSum+oddSum));


    }
}
