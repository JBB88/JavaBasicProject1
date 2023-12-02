package javabasicproject1;

public class codingTask5 {
    //5. Write a program to swap 2 numbers without a temporary variable?
    public static void main(String[] args) {
        int n1 = 69;
        int n2 = 96;

        System.out.println("Before the swap: n1 = " + n1 + ", n2 = " + n2);

        // Swapping using addition and subtraction
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("After the swap: n1 = " + n1 + ", n2 = " + n2);

    }
}
