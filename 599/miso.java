import java.util.HashMap;
import java.util.Map;

public class miso {
    public static void main(String[] args) {
       String[] list1 = {"KFC","Shogun","Tapioca Express","Burger King"} , list2 = {"Burger King","Tapioca Express","Shogun","KFC"};
       miso misso = new miso();
       
       String[] printable = misso.findMISO(list2 , list1);
       for (String string : printable) {
            System.out.println(string);        
       }
    }

    public String[] findMISO(String[] list1 , String[] list2)
    {
        int indexSum = list1.length + list2.length, count = 0;
        Map<Integer , String> result = new HashMap<>();
        for(int i=0 ; i < list1.length ; i++)
        {
            for(int j=0 ; j < list2.length ; j++)
            {
                if( list1[i].equals(list2[j]) && ( i+j < indexSum ) ) 
                {
                    indexSum = i + j;                    
                    result.clear();
                    result.put(count = 0 , list1[i]);
                }
                if( list1[i].equals(list2[j]) && ( i+j == indexSum ) ) 
                {
                    result.put(count++ , list1[i]);
                }
            }
        }
        return result.values().toArray(new String[result.size()]);

    }
}
