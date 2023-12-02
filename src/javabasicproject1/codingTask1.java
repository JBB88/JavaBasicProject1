package javabasicproject1;

public class codingTask1 {
    //1. Create a program that uses an array to store a list of temperatures for a week,
    //and then uses a loop to find the highest and lowest temperature for the week.

    public static void main(String[] args) {

        double [] temp = {57.3,48.7,49.5,57.0,63.8,49.0,55.3};
        double highTemp =temp[0];
        double lowestTemp =temp[0];

        String [] day= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int highTempDay =0;
        int lowTempDay =0;

        for(int i=1;i<temp.length;i++){
            if (temp[i]>highTemp){
                highTemp=temp[i];
                highTempDay=i;

            }

            if(temp[i]<lowestTemp){
                lowestTemp=temp[i];
                lowTempDay=i;
            }
        }

        System.out.println("The Highest Temp of the week is at "+highTemp+ " on "+ day[highTempDay]);
        System.out.println("The Lowest Tem of the week is at "+lowestTemp+ " on " +day[lowTempDay]);

    }
}

