public class s1p3 {
    public static void main(String[] args) 
    {
        String text = "WELCOMETOZOHOCORPORATION";
        s1p3 obj = new s1p3();

        char[][] arr = obj.makeArray(text);

        for(char[] c: arr)
        {
            for(char cc: c)
            {
                System.out.print(cc + "\t");
            }
            System.out.println();
        }

        int[] location = obj.findToo(arr);
        
        System.out.println("<"+location[0]+" , "+location[1]+"> , <"+location[2]+ " , " + location[3] + "> ");
    }

    public char[][] makeArray(String text)
    {
        int x = 0;
        char res[][] = new char[((text.length() % 5) + 1)][5];

        for(int i=0 ; i<text.length() ; i++)
        {
            if(i%5 == 0 && i != 0) x++;
            res[x][i%5] = text.charAt(i);
        }    

        return res;
    }

    public int[] findToo(char[][] arr)
    {
        int[] location = new int[3];

        for(int i=1 ; i<arr.length - 1 ; i++)
            for(int j=1 ; j<(arr[i].length) - 1 ; j++)
            {
                if(arr[i][j] == 'O')
                {
                    if(arr[i-1][j] == 'T' && arr[i+1][j] == 'O') location = new int[]{i-1, j, i+1, j};
                    if(arr[i+1][j] == 'T' && arr[i-1][j] == 'O') location = new int[]{i+1, j, i-1, j};
                    if(arr[i][j-1] == 'T' && arr[i][j+1] == 'O') location = new int[]{i, j-1, i, j+1};
                    if(arr[i][j+1] == 'T' && arr[i][j-1] == 'O') location = new int[]{i, j+1, i, j-1};
                }
            }
        return location;
    }
}
