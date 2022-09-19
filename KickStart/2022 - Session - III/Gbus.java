import java.util.Scanner;

public class Gbus {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int cases = s.nextInt();

        for(int i = 1 ; i <= cases ; i++)
        {
            System.out.print("Case #" + i + ": ");
            for (int val : solution()) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[] solution()
    {
        int bus = s.nextInt();
        int[] stops = new int[bus * 2];

        for(int i = 0 ; i < (bus * 2) ; i++)
        {
            stops[i] = s.nextInt();
        }

        int tasks = s.nextInt();
        int trackStops[] = new int[tasks];

        for (int i = 0; i < trackStops.length; i++) {
            trackStops[i] = s.nextInt();
        }

        int res[] = new int[trackStops.length];
        int count = 0;
        for(int i = 0 ; i < trackStops.length ; i++)
        {
            for(int j = 0 ; j < stops.length ; j += 2)
                if(stops[j] <= trackStops[i] && stops[j+1] >= trackStops[i])
                    count++;
            res[i] = count;
            count = 0;
        }

        return res;
    }
}
