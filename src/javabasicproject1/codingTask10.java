package javabasicproject1;

public class codingTask10 {
    //10.Write a program to print out duplicate elements from an Array of Strings

    public static void main(String[] args) {

        String [] carsArray = {"Toyota","Honda", "Hyundai", "Toyota", "Kia", "Nissan", "Honda"};

        for(int i=0; i<carsArray.length; i++){
            for(int j=i+1;j<carsArray.length; j++){
                if(carsArray[i]==carsArray[j]){
                    System.out.println("Duplicate Elements: "+carsArray[i]);
                }
            }
        }

    }
}
