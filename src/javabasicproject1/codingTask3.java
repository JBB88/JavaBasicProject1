package javabasicproject1;

public class codingTask3 {
    //3. Create a 2D array or integer type where you will store odd and even
    //numbers. Develop a program which will identify/print the even numbers
    //only.
    public static void main(String[] args) {
        int[][] numArray = {
                {1, 8, 26, 15, 56},
                {12, 8, 29, 88, 56},
                {1, 81, 9, 28, 13}
        };


        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                if (numArray[i][j] % 2 == 0) {
                    System.out.print(numArray[i][j] + " ");
                }
            }
        }
    }
}
