public class countNegative {
    public static void main(String[] args) {
        int grid[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        countNegative obj = new countNegative();
        System.out.println(obj.countNegatives(grid));
    }

    public int countNegatives(int[][] grid) {
        int count = 0 ;

        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int j = grid[i].length -1 ; j >= 0 ; j--)
            {
                if(grid[i][j] < 0) count++;
                else break;
            }
        }
        return count;
    }
}
