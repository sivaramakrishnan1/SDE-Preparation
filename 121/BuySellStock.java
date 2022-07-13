/**
 * BuySellStock
 */
public class BuySellStock {

    public static void main(String[] args) {
        
        BuySellStock bsStock = new BuySellStock();

        // input = [7,1,5,3,6,4] , Output: 5
        int arr[] = { 7,1,5,3,6,4 };

        // Input: prices = [7,6,4,3,1] Output: 0
        // int arr[] = { 7,6,4,3,1 };

        System.out.println(bsStock.findDate(arr));
    }

    public int findDate(int arr[])
    {
        // !this works but not for 1000 values arr. takes long time
        int big = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i] < arr[j])
                {
                    big = (arr[j] - arr[i] > big) ? arr[j] - arr[i] : big;
                }
            }
        }
        return big;
    
        /*
        int small = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[small]) small = i;
        }

        if(small == arr.length-1) return 0;

        int big = small+1;
        for (int i = small; i < arr.length; i++) {
            if(arr[i] > arr[big]) big = i;
        }
        return (arr[big] - arr[small]); */
    }
}