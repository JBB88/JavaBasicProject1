package javabasicproject1;

public class codingTask2 {
    //2. Create an array of integer values. After the array is created, calculate the
    //sum of all stored elements in that array.

    public static void main(String[] args) {
        int [] numbers ={12,48,56,78,32,9,10};
        int sum=0;
        for(int i=0; i<7;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
