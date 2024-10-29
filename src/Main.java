import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] DataPoints= new int[100];

        for (int i = 0; i < DataPoints.length; i++){
            DataPoints[i] = new Random().nextInt(100);}

        for (int DataPoint: DataPoints){
            System.out.println(DataPoint + " | ");
        }

        int sum = 0;

        for(int DataPoint: DataPoints){ sum += DataPoint;}

        int average = sum/DataPoints.length;

        System.out.println(" The average of the random array DataPoint is : " + average);
        System.out.println(" The sum of the random array Datapoint is : " + sum);
    }
}