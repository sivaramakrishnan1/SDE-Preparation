public class RankArray {
    public static void main(String[] args) {
        int[] arr = { 37,12,28,9,100,56,80,5,12 };
        arr = arrayRankTransform(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] arrayRankTransform(int[] arr) {
        int res[] = new int[arr.length];
        int bigSmall = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) 
        {
            int val = biggerThanSmall(arr, bigSmall);
            for (int j = 0; j < res.length; j++) {
                if(arr[j] == val)
                {
                    res[j] = i+1;
                }
            }
            bigSmall = val;
        }
        return res;
    }

    public static int biggerThanSmall(int[] arr , int bigSmall)
    {
        int small = Integer.MAX_VALUE;
        for(int j = 0 ; j < arr.length ; j++)      
        {
            if(arr[j] > bigSmall )
            {
                if(arr[j] < small)
                {
                    small = arr[j];
                }
            }
        }
        return small;            
    }
}
