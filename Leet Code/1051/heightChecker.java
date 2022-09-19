public class heightChecker {
    public static void main(String[] args) {
        int[] height = {1,1,4,2,1,3};
        heightChecker obj = new heightChecker();
        System.out.println(obj.heightCheckers(height));
    }

    public int heightCheckers(int[] heights) {
        int[] check = heights.clone();
        int count = 0 ;
        for(int i = 0 ; i < check.length ; i++)
        {
            for(int j = i + 1 ; j < check.length ; j++)
            {
                if(check[i] > check[j])
                {
                    int temp = check[i];
                    check[i] = check[j];
                    check[j] = temp;
                }                
            }
            if(heights[i] != check[i]) count++;
        }

        return count;
    }
}
