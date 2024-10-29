import java.util.Scanner;
public class Part2 {
    public static void main(String[] args) {

        Scanner datapoint = new Scanner(System.in);

        System.out.println(" Enter a number 1-100 : ");

        int[] DataPoints = new int[100];

        for (int DataPoint : DataPoints) {
            System.out.println(datapoint);
        }


        for (int DataPoint : DataPoints) {
            System.out.println("The matched datapoint was " + datapoint);
        }


        int max = DataPoints[0];

        for (int i = 1; i < DataPoints.length; i++) {
            if (max < DataPoints[i]) {
                max = DataPoints[i];
            }
            System.out.println("The maximum value is " + max);

        }


        int min = DataPoints[0];

        for (int i = 1; i < DataPoints.length; i++) {
            if (max > DataPoints[i]) {
                max = DataPoints[i];
            }
            System.out.println("The maximum value is " + min);


        }

        int sum = 0;

        for(int DataPoint: DataPoints){ sum += DataPoint;}

        int average = sum/DataPoints.length;

        System.out.println(" The average of the random array DataPoint is : " + average);
    }
}
