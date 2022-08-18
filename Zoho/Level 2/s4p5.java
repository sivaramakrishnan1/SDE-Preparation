import java.util.Scanner;

public class s4p5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("No. of stops : ");
        int stops = s.nextInt();

        System.out.println("Distance between bunks : ");
        int distanceToBunks[] = new int[stops];
        for (int i = 0; i < distanceToBunks.length; i++) {
            distanceToBunks[i] = s.nextInt();
        }

        System.out.println("Capacity of fuel refilled : ");

        int fuelCapacity[] = new int[stops];
        for (int i = 0; i < fuelCapacity.length; i++) {
            fuelCapacity[i] = s.nextInt();
        }
        
        s4p5 obj = new s4p5();

        int res = obj.findRemainingFuel(distanceToBunks , fuelCapacity, 2);
        if(res != -1) System.out.println("Car ran out fuel in between bunks");
        System.out.println("Remaining petrol in car is " + res + " liters");
        s.close();
    }

    public int findRemainingFuel(int[] bunkIntervals , int[] fuelCapacity, int balance)
    {
        for(int i = 0 ; i < fuelCapacity.length ; i++)
        {
            balance = balance + fuelCapacity[i] - bunkIntervals[i];        
            if(balance < 0) return -1;
        }
        return balance;
    }
}
