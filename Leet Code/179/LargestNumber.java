import java.util.*;

class LargestNumber
{
	public static void main(String args[])
	{
		int[] num = {3,30,34,5,9};
		LargestNumber ln = new LargestNumber();
		System.out.println(ln.largestNumber(num));
		return;
	}
	
	
	public String largestNumber(int[] nums) {
        String res = "";
		
		TreeSet<Integer> tree = new TreeSet<>(new compareIt());
		
		for(int i : nums)
			tree.add(i);
		
		Iterator des = tree.descendingIterator();
		
		while(des.hasNext())
		{
			res += des.next();
		}
		
		return res;
    }
}

class compareIt implements Comparator<Integer>
{
	public int compare(Integer a, Integer b)
	{
		
		return a.toString().charAt(0) - a.toString().charAt(0);
	}
}