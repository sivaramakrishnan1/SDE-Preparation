import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class miso2 {
    public static void main(String[] args) {
        String[] list1 = {"KFC","Shogun","Tapioca Express","Burger King","KFC"} , list2 = {"Shogun","KFC","Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
       miso2 misso2 = new miso2();
       // System.out.println(misso2.findMISO2(list1 , list2));

       String[] printable = misso2.findMISO2(list1 , list2);
       for (String string : printable) {
            System.out.println(string);        
       }
    }
    
    public String[] findMISO2(String[] list1 , String[] list2)
    {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new LinkedList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i=0;i<list1.length;i++) 
        map.put(list1[i], i);

        for (int i=0;i<list2.length;i++) 
        {
            Integer j = map.get(list2[i]);
            if (j != null && i + j <= minSum) 
            {
                if (i + j < minSum) 
                { 
                    res.clear(); 
                    minSum = i+j; 
                }
                res.add(list2[i]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}
