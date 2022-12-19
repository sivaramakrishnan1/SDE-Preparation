import java.util.TreeSet;
import java.util.Iterator;

class LargestNumber
{
	{
	int[] num = {3,30,34,5,9};
		System.out.println(largestNumber(num));
	}
	public static void main(String args[])
	{
		return;
	}
	
	
	public String largestNumber(int[] nums) {
        String res = "";
		
		TreeSet<String> tree = new TreeSet<>((String a, String b) -> a.equals(b));
		
		for(int i : nums)
			tree.add(i + "");
		
		Iterator des = tree.descendingIterator();
		
		while(des.hasNext())
		{
			res += des.next();
		}
		
		return res;
    }
}