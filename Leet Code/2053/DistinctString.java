public class DistinctString {
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        System.out.println(kthDistinct(arr, 2));
    }

    public static String kthDistinct(String[] arr, int k) {        
        
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] != null && arr[j] != null && arr[i].equals(arr[j]))
                {
                    arr[i] = null;
                    arr[j] = null;
                }
            }
        }
        
        /* int count = 1;

        for (int i = 0; i < arr.length ; i++)
        {
            if(arr[i] != null) continue;
            else System.out.println(i + " " + arr[i]);
        } */

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] != null)
            {
                k--;
                if(k == 0) return arr[i];
            }
        }

        return new String("");
    }
}
