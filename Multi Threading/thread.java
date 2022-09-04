public class thread extends Thread{
    private int arr[];
    private int start, end, find;

    thread(int[] arr, int start, int end, int find)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.find = find;
    }

    @Override
    public void run() {
        // System.out.println("Searching for " + this.find + " from " + this.start + " to " + this.end);
        end = (end > arr.length) ? arr.length : end ;
        for(int i = start ; i < end ; i++)
        {
            if(arr[i] == find){
                System.out.println("Found at " + i);
            }
        }
    }
}