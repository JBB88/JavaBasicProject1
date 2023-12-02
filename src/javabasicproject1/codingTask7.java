package javabasicproject1;

public class codingTask7 {
    //6. Write a java program to check whether a given number is prime or not?
    // Prime number has only 2 factors 1 and itself ---> ex: 5 => 1 and 5
    public static void main(String[] args) {

        int number = 17;
        int count = 0;

        if (number>1)
        {
            for(int i=1;i<=number;i++)
            {
                if(number%i==0)
                    count++;
            }
            if(count==2)
            {
                System.out.println("This given number " +number+ " is a PRIME NUMBER");
            }
            else
            {
                System.out.println("This given number " +number+ " is NOT PRIME NUMBER");
            }

        }
        else
        {
            System.out.println("This given number " +number+ " is a PRIME NUMBER");
        }

    }

}
